var common = {
    addHour :function (dates,num) {
        num = parseInt(num) * 60 * 60 * 1000;
        dates = parseInt(Date.parse(dates));
        var currentDate = new Date(dates+num);
        return common.composeDate(currentDate);
    },
    composeDate : function(strDate){
        return strDate.getFullYear() + "-" + common.add0((strDate.getMonth() + 1)) + "-" + common.add0(strDate.getDate()) + " " + common.add0(strDate.getHours()) + ":" + common.add0(strDate.getMinutes()) + ":" + common.add0(strDate.getSeconds());
    },
    add0 : function (str) {
        return str<10 ? '0'+str : str;
    },
    YYYY_MM_DD_HH_MM_SS : function (str) {
        var format = /^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$/;
        return format.test(str);
    },
    YYYY_MM_DD : function (str) {
        var format = /^(\d{4})\-(\d{2})\-(\d{2})$/;
        return format.test(str);
    },
    YYYY_MM_DD_HH_MM : function (str) {
        var format = /^(\d{4})\-(\d{2})\-(\d{2}) (20|21|22|23|[0-1]\d):[0-5]\d$/;
        return format.test(str);
    },
    YYYY_MM :function (str) {
        var format = /^(\d{4})\-(\d{2})$/;
        return format.test(str);
    },
    YYYY_MM_DD_HH : function (str) {
        var format = /^(\d{4})\-(\d{2})\-(\d{2}) (20|21|22|23|[0-1]\d)$/;
        return format.test(str);
    }
};