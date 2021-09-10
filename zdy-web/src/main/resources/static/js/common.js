var common = {
    addHour: function (dates, num) {//增加小时，dates:'传入时间' num:增加小时数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 60 * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.buildDate(currentDate, format);
    },
    DateResolve:function(dates, num, type){//dates: 时间, num： 增加数, type: 类型(M代表月D代表天H代表小时MI代表分钟S代表秒MS代表毫秒)
        let format = common.chooseDateFormat(dates);

    },
    addMinute: function (dates, num) {//增加分钟，dates:'传入时间' num:增加分钟数(不可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.buildDate(currentDate, format);
    },
    addDay: function (dates, num) {//增加天，dates:'传入时间' num:增加天数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 24 * 60 * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.buildDate(currentDate, format);
    },
    addMonth: function (dates, num) {//增加月，dates:'传入时间' num:增加月份(不可传小数) 返回传入时间格式类型，传入-号可做减法
        if(null==dates){
            return ;
        }
        let format = common.chooseDateFormat(dates);
        date = new Date(dates);
        let day = date.getDate(),
            month = date.getMonth(),
            year = date.getFullYear(),
            dateArr = common.dateFormat(date,format).split(' ');

        year = year + parseInt((month + num) / 12);
        month = (month + num) % 12;
        //0-11 转变为 1-12
        month += 1;

        //获取特定年月的最大天数值
        let maxDayCount = new Date(year, month, 0).getDate();
        day > maxDayCount ? day = maxDayCount : '';

        month < 10 ? (month = '0' + month) : '';
        day < 10 ? (day = '0' + day) : '';
        if(dateArr.length>1){
            return year + '-' + month + '-' + day + ' ' + dateArr[1];
        }else{
            if(format==='yyyy-MM'){
                return year + '-' + month;
            }else{
                return year + '-' + month + '-' + day + ' ';
            }
        }

    },
    addSecond: function (dates, num) {//增加秒，dates:'传入时间' num:增加秒数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.buildDate(currentDate, format);
    },
    addMillisecond: function (dates, num) {//增加毫秒，dates:'传入时间' num:增加毫秒数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num);
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.buildDate(currentDate, format);
    },
    buildDate: function (strDate, format) {//strDate:传入日期格式的时间,format:日期格式, 根据这两个参数组成日期,返回组合日期,没有以下类型则返回空串
        if (format === 'yyyy-MM-dd hh:mm:ss') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours()) + ":" + common.add0(strDate.getMinutes()) + ":" + common.add0(strDate.getSeconds());
        } else if (format === 'yyyy-MM-dd') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate());
        } else if (format === 'yyyy-MM-dd hh:mm') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours()) + ":" + common.add0(strDate.getMinutes());
        } else if (format === 'yyyy-MM') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1));
        } else if (format === 'yyyy-MM-dd hh') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours());
        } else {
            return '';
        }

    },
    add0: function (str) {//为构造日期单数前加0
        return str < 10 ? '0' + str : str;
    },
    chooseDateFormat: function (str) {//str:传入日期 根据传入日期判断日期格式 返回日期格式 没有则返回空串
        if (common.YYYY_MM_DD_HH_MM_SS(str)) {
            return 'yyyy-MM-dd hh:mm:ss';
        } else if (common.YYYY_MM_DD(str)) {
            return 'yyyy-MM-dd';
        } else if (common.YYYY_MM_DD_HH_MM(str)) {
            return 'yyyy-MM-dd hh:mm';
        } else if (common.YYYY_MM(str)) {
            return 'yyyy-MM';
        } else if (common.YYYY_MM_DD_HH(str)) {
            return 'yyyy-MM-dd hh';
        } else {
            return '';
        }
    },
    YYYY_MM_DD_HH_MM_SS: function (str) {//str : 传入日期,根据传入日期通过正则表达式判断日期(年月日时分秒)格式是否正确,正确返回true错误返回false
        const format = /^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$/;
        return format.test(str);
    },
    YYYY_MM_DD: function (str) {//str : 传入日期,根据传入日期通过正则表达式判断日期(年月日)格式是否正确,正确返回true错误返回false
        const format = /^(\d{4})-(\d{2})-(\d{2})$/;
        return format.test(str);
    },
    YYYY_MM_DD_HH_MM: function (str) {//str : 传入日期,根据传入日期通过正则表达式判断日期(年月日时分)格式是否正确,正确返回true错误返回false
        const format = /^(\d{4})-(\d{2})-(\d{2}) (20|21|22|23|[0-1]\d):[0-5]\d$/;
        return format.test(str);
    },
    YYYY_MM: function (str) {//str : 传入日期,根据传入日期通过正则表达式判断日期(年月)格式是否正确,正确返回true错误返回false
        const format = /^(\d{4})-(\d{2})$/;
        return format.test(str);
    },
    YYYY_MM_DD_HH: function (str) {//str : 传入日期,根据传入日期通过正则表达式判断日期(年月日时)格式是否正确,正确返回true错误返回false
        const format = /^(\d{4})-(\d{2})-(\d{2}) (20|21|22|23|[0-1]\d)$/;
        return format.test(str);
    },
    dateFormat : function (date, format) {
        if(null==date){
            return ''
        }
        if(typeof(date)=='string' || typeof date === 'number'){
            date = (typeof date === 'number') ? new Date(date) : new Date((date || '').replace(/-/g, '/'))
        }

        let o = {
            "M+" : date.getMonth()+1, //month
            "d+" : date.getDate(), //day
            "h+" : date.getHours(), //hour
            "m+" : date.getMinutes(), //minute
            "s+" : date.getSeconds(), //second
            "q+" : Math.floor((date.getMonth()+3)/3), //quarter
            "S" : date.getMilliseconds() //millisecond
        }

        if(/(y+)/.test(format)) {
            format = format.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
        }

        for(let k in o) {
            if(new RegExp("("+ k +")").test(format)) {
                format = format.replace(RegExp.$1, RegExp.$1.length===1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
            }
        }
        return format;
    }
};