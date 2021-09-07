var common = {
    addHour: function (dates, num) {//增加小时，dates:'传入时间' num:增加小时数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 60 * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.composeDate(currentDate, format);
    },
    addMinute: function (dates, num) {//增加分钟，dates:'传入时间' num:增加分钟数(不可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseInt(num) * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.composeDate(currentDate, format);
    },
    addDay: function (dates, num) {//增加天，dates:'传入时间' num:增加天数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 24 * 60 * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.composeDate(currentDate, format);
    },
    addSecond: function (dates, num) {//增加秒，dates:'传入时间' num:增加秒数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num) * 1000;
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.composeDate(currentDate, format);
    },
    addMillisecond: function (dates, num) {//增加毫秒，dates:'传入时间' num:增加毫秒数(可传小数) 返回传入时间格式类型，传入-号可做减法
        let format = common.chooseDateFormat(dates);
        if (format === '') {
            return;
        }
        num = parseFloat(num);
        dates = parseInt(Date.parse(dates));
        let currentDate = new Date(dates + num);
        return common.composeDate(currentDate, format);
    },
    composeDate: function (strDate, format) {//strDate:传入日期格式的时间,format:日期格式, 根据这两个参数组成日期,返回组合日期,没有以下类型则返回空串
        if (format === 'YYYY-MM-DD HH:MM:SS') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours()) + ":" + common.add0(strDate.getMinutes()) + ":" + common.add0(strDate.getSeconds());
        } else if (format === 'YYYY-MM-DD') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate());
        } else if (format === 'YYYY-MM-DD HH:MM') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours()) + ":" + common.add0(strDate.getMinutes());
        } else if (format === 'YYYY-MM') {
            return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1));
        } else if (format === 'YYYY-MM-DD HH') {
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
            return 'YYYY-MM-DD HH:MM:SS';
        } else if (common.YYYY_MM_DD) {
            return 'YYYY-MM-DD';
        } else if (common.YYYY_MM_DD_HH_MM) {
            return 'YYYY-MM-DD HH:MM';
        } else if (common.YYYY_MM) {
            return 'YYYY-MM';
        } else if (common.YYYY_MM_DD_HH) {
            return 'YYYY-MM-DD HH';
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
    }
};