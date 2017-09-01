package xal.cn.com.moni;

import java.util.List;

/**
 * Created by Administrator on 2017/8/31.
 */

public class Bean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":"121","goods_name":"镇店之宝丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg","sales_volume":125204,"efficacy":"镇店之宝 美白爆款","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"389","goods_name":"热销爆款丨清爽平衡矿物黑面膜21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/389/goods_img/17062610265116850439553337.jpg","sales_volume":115632,"efficacy":"以黑吸黑 净透亮肤","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/85/goods_img/170626110544018615493506670.jpg","sales_volume":98038,"efficacy":"水嫩舒爽 鲜活亮颜","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/684/goods_img/17062610401397749701177609.jpg","sales_volume":96754,"efficacy":"水润充盈 鲜嫩少女肌","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/6/goods_img/170626112597120167739086821.jpg","sales_volume":82168,"efficacy":"深层补水 提亮肤色","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"5","goods_name":"金桂花矿物眼膜贴60片","shop_price":69,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/5/goods_img/170626112553213363513709796.jpg","sales_volume":61574,"efficacy":"补水靓眼 改善熊猫眼","goods_type":"0","activityPrice":69,"sort":0},{"id":"772","goods_name":"清爽亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/772/goods_img/17062610359218633814288387.jpg","sales_volume":58581,"efficacy":"热销黑膜 净透亮肤","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"343","goods_name":"夏日美白首选丨美白嫩肤润肤水150ml","shop_price":69,"market_price":119,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/343/goods_img/170626103423611420000294568.jpg","sales_volume":58472,"efficacy":"补水保湿 美白嫩肤","goods_type":"0","activityPrice":59,"sort":0},{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/9/goods_img/170626112611018894167156705.jpg","sales_volume":50165,"efficacy":"镇店之宝 彻夜补水","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"239","goods_name":"蜂蜜矿物蚕丝面膜7片","shop_price":89,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/239/goods_img/17062610417323657548298763.jpg","sales_volume":43370,"efficacy":"深层补水 长效保湿","goods_type":"0","activityPrice":89,"sort":0},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/446/goods_img/170627143627211691152946151.jpg","sales_volume":42277,"efficacy":"水水润润 修护受损","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"16","goods_name":"爆款套装|玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/16/goods_img/17062611152592656236701367.jpg","sales_volume":34407,"efficacy":"一整套源源补水","goods_type":"0","activityPrice":69.9,"sort":0},{"id":"8","goods_name":"全新升级|美白嫩肤面膜20片","shop_price":129.9,"market_price":359,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/170818182578717903477668239.jpg","sales_volume":32172,"efficacy":"真美白 匠心造","goods_type":"0","activityPrice":119.9,"sort":0},{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/428/goods_img/17062610201873359203247864.jpg","sales_volume":29902,"efficacy":"吸黑焕彩 补水保湿","goods_type":"0","activityPrice":79.9,"sort":0},{"id":"83","goods_name":"黑玫瑰矿物蚕丝面膜7片","shop_price":119,"market_price":139,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/83/goods_img/17062611054695656554691442.jpg","sales_volume":27193,"efficacy":"深度保养 补水提亮","goods_type":"6","activityPrice":29.9,"sort":0},{"id":"95","goods_name":"多效套装丨补水滋养提亮修护多效蚕丝面膜28片","shop_price":139.9,"market_price":416,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/95/goods_img/17062611028098335766799711.jpg","sales_volume":26679,"efficacy":"补水滋养 提亮修护","goods_type":"0","activityPrice":139.9,"sort":0},{"id":"559","goods_name":"竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/559/goods_img/170627164784010618075663103.jpg","sales_volume":24679,"efficacy":"控油净肤 细腻毛孔","goods_type":"0","activityPrice":59,"sort":0},{"id":"257","goods_name":"薰衣草蚕丝面膜7片","shop_price":89,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/257/goods_img/17062610401174252264198839.jpg","sales_volume":22063,"efficacy":"补水保湿 舒缓修护","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"87","goods_name":"玫瑰滋养蚕丝面膜7片","shop_price":89,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/87/goods_img/17062611047215818101484887.jpg","sales_volume":21975,"efficacy":"密集滋养 补水保湿","goods_type":"0","activityPrice":1,"sort":0},{"id":"101","goods_name":"玫瑰滋养矿物洁面乳100ml","shop_price":29.9,"market_price":59,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/101/goods_img/170626105885015353255525556.jpg","sales_volume":21245,"efficacy":"温和清洁 补水保湿","goods_type":"0","activityPrice":26.9,"sort":0},{"id":"593","goods_name":"热销爆款丨葡萄籽琉璃亮颜黑面膜21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/593/goods_img/170626104764718576992125163.jpg","sales_volume":20571,"efficacy":"葡萄鲜饮 净透亮肤","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"315","goods_name":"玫瑰滋养矿物润肤水","shop_price":65,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/315/goods_img/17062610389695661847862326.jpg","sales_volume":18266,"efficacy":"持久保湿 静享芬芳","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"379","goods_name":"净透美白矿物蚕丝面膜黑面膜14片","shop_price":69.9,"market_price":198,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/379/goods_img/170803092883014523273181330.jpg","sales_volume":18102,"efficacy":"清洁净透 以白养白","goods_type":"0","activityPrice":69.9,"sort":0},{"id":"336","goods_name":"玫瑰滋养矿物润肤乳液","shop_price":69,"market_price":129,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/336/goods_img/170626103574019791491356888.jpg","sales_volume":16517,"efficacy":"长效保湿 持久滋养","goods_type":"0","activityPrice":69,"sort":0},{"id":"20","goods_name":"清润紧致蚕丝面膜套装21片","shop_price":109.9,"market_price":307,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/20/goods_img/17062611141789578232868733.jpg","sales_volume":15821,"efficacy":"清透滋养 弹嫩紧致","goods_type":"0","activityPrice":109.9,"sort":0},{"id":"313","goods_name":"清爽平衡矿物爽肤水150ml","shop_price":65,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/313/goods_img/17062610398875573627694321.jpg","sales_volume":15128,"efficacy":"补水控油 收敛毛孔","goods_type":"0","activityPrice":65,"sort":0},{"id":"400","goods_name":"缤纷鲜润矿物蚕丝面膜套装20片","shop_price":79.9,"market_price":279.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/400/goods_img/17062610256909777083976637.jpg","sales_volume":14478,"efficacy":"补水亮肤 缤纷水嫩","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"1249","goods_name":"爆款黑膜|盈透柔肤黑膜组合装42片","shop_price":199.9,"market_price":594,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1249/goods_img/17062610325316636947734164.jpg","sales_volume":14042,"efficacy":"清洁补水 保湿提亮","goods_type":"0","activityPrice":199.9,"sort":0},{"id":"17","goods_name":"控油首选丨男士黑茶控油护肤三件套","shop_price":99.9,"market_price":199.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/17/goods_img/170626111428511385203738370.jpg","sales_volume":13741,"efficacy":"控油保湿 型男必备","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"646","goods_name":"黑茶水滢净润黑面膜7片","shop_price":79,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/646/goods_img/170626104271019699528616597.jpg","sales_volume":13176,"efficacy":"深层精华 改善暗沉","goods_type":"0","activityPrice":79,"sort":0}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 121
         * goods_name : 镇店之宝丨美白嫩肤面膜7片
         * shop_price : 49.9
         * market_price : 99.0
         * is_coupon_allowed : true
         * is_allow_credit : false
         * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg
         * sales_volume : 125204
         * efficacy : 镇店之宝 美白爆款
         * goods_type : 0
         * activityPrice : 49.9
         * sort : 0
         */

        private String id;
        private String goods_name;
        private double shop_price;
        private double market_price;
        private boolean is_coupon_allowed;
        private boolean is_allow_credit;
        private String goods_img;
        private int sales_volume;
        private String efficacy;
        private String goods_type;
        private double activityPrice;
        private int sort;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public double getShop_price() {
            return shop_price;
        }

        public void setShop_price(double shop_price) {
            this.shop_price = shop_price;
        }

        public double getMarket_price() {
            return market_price;
        }

        public void setMarket_price(double market_price) {
            this.market_price = market_price;
        }

        public boolean isIs_coupon_allowed() {
            return is_coupon_allowed;
        }

        public void setIs_coupon_allowed(boolean is_coupon_allowed) {
            this.is_coupon_allowed = is_coupon_allowed;
        }

        public boolean isIs_allow_credit() {
            return is_allow_credit;
        }

        public void setIs_allow_credit(boolean is_allow_credit) {
            this.is_allow_credit = is_allow_credit;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public String getGoods_type() {
            return goods_type;
        }

        public void setGoods_type(String goods_type) {
            this.goods_type = goods_type;
        }

        public double getActivityPrice() {
            return activityPrice;
        }

        public void setActivityPrice(double activityPrice) {
            this.activityPrice = activityPrice;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }
    }
}
