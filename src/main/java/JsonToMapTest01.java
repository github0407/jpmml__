import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * JSON字符串自动转换
 * Created by zkn on 2016/8/22.
 */
public class JsonToMapTest01 {

    public static void main(String[] args){

        String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";
        //第一种方式
        String merge_bin_dict1="{\"C_city_x\": [\"C_city_x_encoding\", {\"0\": 0.5471698113207547, \"NAN\": 0.5504587155963303, \"七台河市\": 0.7777777777777778, \"三亚市\": 0.2571428571428571, \"三明市\": 0.7419354838709677, \"三门峡市\": 0.5862068965517241, \"上海市\": 0.3049645390070922, \"上饶市\": 0.6226415094339622, \"东莞市\": 0.4597014925373134, \"东营市\": 0.5625, \"中卫市\": 0.6470588235294118, \"中山市\": 0.517948717948718, \"临夏回族自治州\": 0.5714285714285714, \"临汾市\": 0.5254237288135594, \"临沂市\": 0.6477272727272727, \"临沧市\": 0.6153846153846154, \"丹东市\": 0.6774193548387096, \"丽水市\": 0.375, \"丽江市\": 0.5666666666666667, \"乌兰察布市\": 0.6052631578947368, \"乌海市\": 0.0, \"乐山市\": 0.5483870967741935, \"九江市\": 0.6, \"云浮市\": 0.6438356164383562, \"亳州市\": 0.45, \"伊春市\": 0.36363636363636365, \"佛山市\": 0.41626794258373206, \"佳木斯市\": 0.8473282442748091, \"保定市\": 0.6, \"保山市\": 0.8666666666666667, \"信阳市\": 0.37037037037037035, \"儋州市\": 0.5, \"六安市\": 0.23076923076923078, \"六盘水市\": 0.7272727272727273, \"兰州市\": 0.48484848484848486, \"兴安盟\": 0.6666666666666666, \"内江市\": 0.8461538461538461, \"凉山彝族自治州\": 0.6086956521739131, \"包头市\": 0.5405405405405406, \"北京市\": 0.3370473537604457, \"北海市\": 0.712, \"十堰市\": 0.5294117647058824, \"南京市\": 0.325, \"南充市\": 0.5806451612903226, \"南宁市\": 0.5594713656387665, \"南平市\": 0.62, \"南昌市\": 0.5402298850574713, \"南通市\": 0.38636363636363635, \"南阳市\": 0.6222222222222222, \"厦门市\": 0.44966442953020136, \"双鸭山市\": 0.782608695652174, \"台州市\": 0.37681159420289856, \"合肥市\": 0.37362637362637363, \"吉安市\": 0.6363636363636364, \"吉林市\": 0.735632183908046, \"吕梁市\": 0.7358490566037735, \"吴忠市\": 0.725, \"周口市\": 0.3076923076923077, \"呼伦贝尔市\": 0.7876106194690266, \"呼和浩特市\": 0.4537037037037037, \"咸宁市\": 0.5384615384615384, \"咸阳市\": 0.6551724137931034, \"哈尔滨市\": 0.625, \"唐山市\": 0.5333333333333333, \"商丘市\": 0.2222222222222222, \"商洛市\": 0.35714285714285715, \"嘉兴市\": 0.34523809523809523, \"嘉峪关市\": 0.6153846153846154, \"四平市\": 0.8045977011494253, \"固原市\": 0.5555555555555556, \"大兴安岭地区\": 0.0, \"大同市\": 0.7903225806451613, \"大庆市\": 0.6415094339622641, \"大理白族自治州\": 0.5405405405405406, \"大连市\": 0.5272727272727272, \"天水市\": 0.2727272727272727, \"天津市\": 0.455026455026455, \"太原市\": 0.42857142857142855, \"威海市\": 0.5102040816326531, \"娄底市\": 0.8214285714285714, \"孝感市\": 0.5454545454545454, \"宁德市\": 0.6071428571428571, \"宁波市\": 0.35135135135135137, \"安庆市\": 0.5, \"安康市\": 0.6470588235294118, \"安阳市\": 0.6833333333333333, \"安顺市\": 0.23809523809523808, \"定西市\": 0.7058823529411765, \"宜宾市\": 0.7066666666666667, \"宜昌市\": 0.6324786324786325, \"宜春市\": 0.6296296296296297, \"宝鸡市\": 0.5769230769230769, \"宣城市\": 0.5862068965517241, \"宿州市\": 0.2, \"宿迁市\": 0.6811594202898551, \"岳阳市\": 0.6170212765957447, \"崇左市\": 0.5555555555555556, \"巴中市\": 0.6363636363636364, \"巴彦淖尔市\": 0.3125, \"常州市\": 0.390625, \"常德市\": 0.47368421052631576, \"平凉市\": 0.5789473684210527, \"平顶山市\": 0.7428571428571429, \"广元市\": 0.6923076923076923, \"广安市\": 0.2727272727272727, \"广州市\": 0.42105263157894735, \"庆阳市\": 0.5806451612903226, \"廊坊市\": 0.3883495145631068, \"延安市\": 0.46153846153846156, \"延边朝鲜族自治州\": 0.6363636363636364, \"开封市\": 0.631578947368421, \"张家口市\": 0.6814159292035398, \"张家界市\": 0.5454545454545454, \"张掖市\": 0.5357142857142857, \"徐州市\": 0.4696969696969697, \"德宏傣族景颇族自治州\": 0.625, \"德州市\": 0.6333333333333333, \"德阳市\": 0.6216216216216216, \"忻州市\": 0.75, \"怀化市\": 0.5428571428571428, \"怒江傈僳族自治州\": 0.5, \"恩施土家族苗族自治州\": 0.5961538461538461, \"惠州市\": 0.4011627906976744, \"成都市\": 0.35379061371841153, \"扬州市\": 0.3695652173913043, \"承德市\": 0.7894736842105263, \"抚州市\": 0.6111111111111112, \"抚顺市\": 0.4444444444444444, \"揭阳市\": 0.36507936507936506, \"攀枝花市\": 0.7222222222222222, \"文山壮族苗族自治州\": 0.5555555555555556, \"新乡市\": 0.6097560975609756, \"新余市\": 0.6875, \"无锡市\": 0.39436619718309857, \"日照市\": 0.5, \"昆明市\": 0.47843137254901963, \"昭通市\": 0.5952380952380952, \"晋中市\": 0.7532467532467533, \"晋城市\": 0.7285714285714285, \"普洱市\": 0.5, \"景德镇市\": 0.3333333333333333, \"曲靖市\": 0.7285714285714285, \"朔州市\": 0.4444444444444444, \"朝阳市\": 0.6486486486486487, \"本溪市\": 0.6923076923076923, \"来宾市\": 0.6153846153846154, \"杭州市\": 0.34594594594594597, \"松原市\": 0.8333333333333334, \"果洛藏族自治州\": 0.0, \"枣庄市\": 0.6052631578947368, \"柳州市\": 0.5588235294117647, \"株洲市\": 0.7619047619047619, \"桂林市\": 0.6375, \"梅州市\": 0.38596491228070173, \"梧州市\": 0.65625, \"楚雄彝族自治州\": 0.5862068965517241, \"榆林市\": 0.5263157894736842, \"武威市\": 0.6896551724137931, \"武汉市\": 0.4439252336448598, \"毕节市\": 0.6, \"永州市\": 0.4117647058823529, \"汉中市\": 0.4074074074074074, \"汕头市\": 0.36893203883495146, \"汕尾市\": 0.48484848484848486, \"江门市\": 0.3942307692307692, \"池州市\": 0.42857142857142855, \"沈阳市\": 0.5875912408759124, \"沧州市\": 0.6470588235294118, \"河南省\": 0.75, \"河池市\": 0.5961538461538461, \"河源市\": 0.42857142857142855, \"泉州市\": 0.4792626728110599, \"泰安市\": 0.5862068965517241, \"泰州市\": 0.36, \"泸州市\": 0.7272727272727273, \"洛阳市\": 0.625, \"济南市\": 0.4065934065934066, \"济宁市\": 0.5757575757575758, \"海东市\": 0.75, \"海南省\": 0.6, \"海南藏族自治州\": 0.0, \"海口市\": 0.550561797752809, \"海西蒙古族藏族自治州\": 0.5714285714285714, \"淄博市\": 0.7920792079207921, \"淮北市\": 0.5, \"淮南市\": 0.6153846153846154, \"淮安市\": 0.4375, \"深圳市\": 0.3850806451612903, \"清远市\": 0.5081967213114754, \"温州市\": 0.4322033898305085, \"渭南市\": 0.4418604651162791, \"湖北省\": 0.625, \"湖州市\": 0.46153846153846156, \"湘潭市\": 0.7391304347826086, \"湘西土家族苗族自治州\": 0.4375, \"湛江市\": 0.5277777777777778, \"滁州市\": 0.2, \"滨州市\": 0.717391304347826, \"漯河市\": 0.5789473684210527, \"漳州市\": 0.6026490066225165, \"潍坊市\": 0.5126050420168067, \"潮州市\": 0.20930232558139536, \"澳門特別行政區\": 0.0, \"濮阳市\": 0.6666666666666666, \"烟台市\": 0.7630331753554502, \"焦作市\": 0.5277777777777778, \"牡丹江市\": 0.7222222222222222, \"玉林市\": 0.695364238410596, \"玉树藏族自治州\": 1.0, \"玉溪市\": 0.6890756302521008, \"珠海市\": 0.38461538461538464, \"甘南藏族自治州\": 0.5, \"甘孜藏族自治州\": 0.5, \"白城市\": 0.7857142857142857, \"白山市\": 0.6190476190476191, \"白银市\": 0.4878048780487805, \"百色市\": 0.5, \"益阳市\": 0.5238095238095238, \"盐城市\": 0.4166666666666667, \"盘锦市\": 0.3888888888888889, \"眉山市\": 0.7058823529411765, \"石嘴山市\": 0.7083333333333334, \"石家庄市\": 0.4416243654822335, \"福州市\": 0.4519774011299435, \"秦皇岛市\": 0.5584415584415584, \"红河哈尼族彝族自治州\": 0.6808510638297872, \"绍兴市\": 0.41509433962264153, \"绥化市\": 0.7551020408163265, \"绵阳市\": 0.7647058823529411, \"聊城市\": 0.4594594594594595, \"肇庆市\": 0.562962962962963, \"自贡市\": 0.5555555555555556, \"舟山市\": 0.4, \"芜湖市\": 0.6756756756756757, \"苏州市\": 0.43661971830985913, \"茂名市\": 0.4523809523809524, \"荆州市\": 0.6122448979591837, \"荆门市\": 0.5789473684210527, \"莆田市\": 0.4897959183673469, \"莱芜市\": 0.25, \"菏泽市\": 0.7209302325581395, \"萍乡市\": 0.8288288288288288, \"营口市\": 0.703125, \"葫芦岛市\": 0.5806451612903226, \"蚌埠市\": 0.4444444444444444, \"衡水市\": 0.5517241379310345, \"衡阳市\": 0.6176470588235294, \"衢州市\": 0.4782608695652174, \"襄阳市\": 0.6702127659574468, \"西双版纳傣族自治州\": 0.42857142857142855, \"西宁市\": 0.4090909090909091, \"西安市\": 0.5037593984962406, \"许昌市\": 0.6875, \"贵港市\": 0.6486486486486487, \"贵阳市\": 0.5474452554744526, \"贺州市\": 0.6756756756756757, \"资阳市\": 0.3333333333333333, \"赣州市\": 0.45038167938931295, \"赤峰市\": 0.6091954022988506, \"辽源市\": 0.6818181818181818, \"辽阳市\": 0.7916666666666666, \"达州市\": 0.6190476190476191, \"运城市\": 0.6666666666666666, \"连云港市\": 0.5, \"迪庆藏族自治州\": 0.6666666666666666, \"通化市\": 0.6666666666666666, \"通辽市\": 0.748792270531401, \"遂宁市\": 0.47058823529411764, \"遵义市\": 0.5217391304347826, \"邢台市\": 0.7025316455696202, \"邯郸市\": 0.7309236947791165, \"邵阳市\": 0.47058823529411764, \"郑州市\": 0.526829268292683, \"郴州市\": 0.6326530612244898, \"鄂尔多斯市\": 0.6346153846153846, \"鄂州市\": 0.7457627118644068, \"酒泉市\": 0.7105263157894737, \"重庆市\": 0.5017421602787456, \"金华市\": 0.38095238095238093, \"金昌市\": 0.8333333333333334, \"钦州市\": 0.509090909090909, \"铁岭市\": 0.8208955223880597, \"铜仁市\": 0.68, \"铜川市\": 0.3333333333333333, \"铜陵市\": 0.5, \"银川市\": 0.6091954022988506, \"锡林郭勒盟\": 0.3, \"锦州市\": 0.40540540540540543, \"镇江市\": 0.41379310344827586, \"长春市\": 0.6994818652849741, \"长沙市\": 0.4689265536723164, \"长治市\": 0.5263157894736842, \"阜新市\": 0.7619047619047619, \"阜阳市\": 0.43333333333333335, \"防城港市\": 0.6666666666666666, \"阳江市\": 0.6410256410256411, \"阳泉市\": 0.2, \"阿坝藏族羌族自治州\": 0.4, \"阿拉善盟\": 0.75, \"陇南市\": 0.42857142857142855, \"随州市\": 0.21428571428571427, \"雅安市\": 0.3125, \"青岛市\": 0.3684210526315789, \"鞍山市\": 0.6086956521739131, \"韶关市\": 0.5064935064935064, \"马鞍山市\": 0.5, \"驻马店市\": 0.4444444444444444, \"鸡西市\": 0.6875, \"鹤壁市\": 0.7142857142857143, \"鹤岗市\": 0.7333333333333333, \"鹰潭市\": 0.16666666666666666, \"黄冈市\": 0.6078431372549019, \"黄南藏族自治州\": 0.0, \"黄山市\": 0.42857142857142855, \"黄石市\": 0.5757575757575758, \"黑河市\": 0.4, \"黔东南苗族侗族自治州\": 0.5471698113207547, \"黔南布依族苗族自治州\": 0.38461538461538464, \"黔西南布依族苗族自治州\": 0.4827586206896552, \"齐齐哈尔市\": 0.6666666666666666, \"龙岩市\": 0.68}], \"O_city\": [\"O_city_encoding\", {0: 0.5285961871750433, \"七台河市\": 0.8125, \"三亚市\": 0.3235294117647059, \"三明市\": 0.7384615384615385, \"三门峡市\": 0.5806451612903226, \"上海市\": 0.3104693140794224, \"上饶市\": 0.6296296296296297, \"东莞市\": 0.46686746987951805, \"东营市\": 0.5882352941176471, \"中卫市\": 0.6875, \"中山市\": 0.5257731958762887, \"临夏回族自治州\": 0.5454545454545454, \"临汾市\": 0.543859649122807, \"临沂市\": 0.6436781609195402, \"临沧市\": 0.5833333333333334, \"丹东市\": 0.6551724137931034, \"丽水市\": 0.391304347826087, \"丽江市\": 0.5483870967741935, \"乌兰察布市\": 0.6060606060606061, \"乌海市\": 0.0, \"乌鲁木齐市\": 0.0, \"乐山市\": 0.5757575757575758, \"九江市\": 0.6111111111111112, \"云浮市\": 0.6666666666666666, \"亳州市\": 0.4, \"伊春市\": 0.3333333333333333, \"佛山市\": 0.4386792452830189, \"佳木斯市\": 0.8615384615384616, \"保定市\": 0.6666666666666666, \"保山市\": 0.8571428571428571, \"信阳市\": 0.37037037037037035, \"儋州市\": 0.4444444444444444, \"六安市\": 0.2727272727272727, \"六盘水市\": 0.7391304347826086, \"兰州市\": 0.45588235294117646, \"兴安盟\": 0.6625, \"内江市\": 0.7692307692307693, \"凉山彝族自治州\": 0.6119402985074627, \"包头市\": 0.48484848484848486, \"北京市\": 0.34173669467787116, \"北海市\": 0.7024793388429752, \"十堰市\": 0.5294117647058824, \"南京市\": 0.32142857142857145, \"南充市\": 0.5666666666666667, \"南宁市\": 0.5450643776824035, \"南平市\": 0.6170212765957447, \"南昌市\": 0.5280898876404494, \"南通市\": 0.38636363636363635, \"南阳市\": 0.6190476190476191, \"厦门市\": 0.45695364238410596, \"双鸭山市\": 0.7708333333333334, \"台州市\": 0.35714285714285715, \"合肥市\": 0.37777777777777777, \"吉安市\": 0.6538461538461539, \"吉林市\": 0.7529411764705882, \"吕梁市\": 0.7254901960784313, \"吴忠市\": 0.6666666666666666, \"周口市\": 0.2727272727272727, \"呼伦贝尔市\": 0.7913043478260869, \"呼和浩特市\": 0.4732142857142857, \"咸宁市\": 0.5652173913043478, \"咸阳市\": 0.6153846153846154, \"哈尔滨市\": 0.6301369863013698, \"唐山市\": 0.5254237288135594, \"商丘市\": 0.23529411764705882, \"商洛市\": 0.35714285714285715, \"嘉兴市\": 0.3924050632911392, \"嘉峪关市\": 0.6666666666666666, \"四平市\": 0.8095238095238095, \"固原市\": 0.5, \"大兴安岭地区\": 0.0, \"大同市\": 0.8, \"大庆市\": 0.6545454545454545, \"大理白族自治州\": 0.5526315789473685, \"大连市\": 0.5149700598802395, \"天水市\": 0.2727272727272727, \"天津市\": 0.44680851063829785, \"太原市\": 0.4369747899159664, \"威海市\": 0.5, \"娄底市\": 0.8888888888888888, \"孝感市\": 0.55, \"宁德市\": 0.6, \"宁波市\": 0.3302752293577982, \"安庆市\": 0.5555555555555556, \"安康市\": 0.6190476190476191, \"安阳市\": 0.7017543859649122, \"安顺市\": 0.21951219512195122, \"定西市\": 0.7058823529411765, \"宜宾市\": 0.7162162162162162, \"宜昌市\": 0.5904761904761905, \"宜春市\": 0.5660377358490566, \"宝鸡市\": 0.5652173913043478, \"宣城市\": 0.5517241379310345, \"宿州市\": 0.2, \"宿迁市\": 0.6714285714285714, \"岳阳市\": 0.6304347826086957, \"崇左市\": 0.5172413793103449, \"巴中市\": 0.6507936507936508, \"巴彦淖尔市\": 0.3125, \"常州市\": 0.3939393939393939, \"常德市\": 0.43243243243243246, \"平凉市\": 0.6, \"平顶山市\": 0.696969696969697, \"广元市\": 0.7142857142857143, \"广安市\": 0.3, \"广州市\": 0.4307116104868914, \"庆阳市\": 0.5806451612903226, \"廊坊市\": 0.39805825242718446, \"延安市\": 0.46153846153846156, \"延边朝鲜族自治州\": 0.6285714285714286, \"开封市\": 0.6571428571428571, \"张家口市\": 0.6936936936936937, \"张家界市\": 0.5, \"张掖市\": 0.5172413793103449, \"徐州市\": 0.46875, \"德宏傣族景颇族自治州\": 0.5555555555555556, \"德州市\": 0.6, \"德阳市\": 0.6153846153846154, \"忻州市\": 0.7659574468085106, \"怀化市\": 0.5294117647058824, \"怒江傈僳族自治州\": 0.5, \"恩施土家族苗族自治州\": 0.5686274509803921, \"惠州市\": 0.3905325443786982, \"成都市\": 0.3553113553113553, \"扬州市\": 0.391304347826087, \"承德市\": 0.7962962962962963, \"抚州市\": 0.5882352941176471, \"抚顺市\": 0.5, \"揭阳市\": 0.4098360655737705, \"攀枝花市\": 0.7222222222222222, \"文山壮族苗族自治州\": 0.5454545454545454, \"新乡市\": 0.6463414634146342, \"新余市\": 0.6875, \"无锡市\": 0.3684210526315789, \"日照市\": 0.42857142857142855, \"昆明市\": 0.4782608695652174, \"昭通市\": 0.631578947368421, \"晋中市\": 0.7532467532467533, \"晋城市\": 0.7142857142857143, \"普洱市\": 0.42857142857142855, \"景德镇市\": 0.3, \"曲靖市\": 0.7222222222222222, \"朔州市\": 0.5, \"朝阳市\": 0.6388888888888888, \"本溪市\": 0.6944444444444444, \"来宾市\": 0.5714285714285714, \"杭州市\": 0.3489583333333333, \"松原市\": 0.8676470588235294, \"果洛藏族自治州\": 0.0, \"枣庄市\": 0.5897435897435898, \"柳州市\": 0.5714285714285714, \"株洲市\": 0.75, \"桂林市\": 0.6493506493506493, \"梅州市\": 0.36538461538461536, \"梧州市\": 0.6593406593406593, \"楚雄彝族自治州\": 0.5535714285714286, \"榆林市\": 0.5294117647058824, \"武威市\": 0.6666666666666666, \"武汉市\": 0.4372093023255814, \"毕节市\": 0.6428571428571429, \"永州市\": 0.4444444444444444, \"汉中市\": 0.43478260869565216, \"汕头市\": 0.3431372549019608, \"汕尾市\": 0.5079365079365079, \"江门市\": 0.4117647058823529, \"池州市\": 0.5, \"沈阳市\": 0.5714285714285714, \"沧州市\": 0.638095238095238, \"河南省\": 0.5, \"河池市\": 0.6274509803921569, \"河源市\": 0.4358974358974359, \"泉州市\": 0.4834123222748815, \"泰安市\": 0.6428571428571429, \"泰州市\": 0.36363636363636365, \"泸州市\": 0.6818181818181818, \"洛阳市\": 0.6623376623376623, \"济南市\": 0.42857142857142855, \"济宁市\": 0.5757575757575758, \"海东市\": 0.6666666666666666, \"海南省\": 0.5342465753424658, \"海南藏族自治州\": 0.0, \"海口市\": 0.5617977528089888, \"海西蒙古族藏族自治州\": 0.5, \"淄博市\": 0.7920792079207921, \"淮北市\": 0.5555555555555556, \"淮南市\": 0.5714285714285714, \"淮安市\": 0.41935483870967744, \"深圳市\": 0.3878787878787879, \"清远市\": 0.4789915966386555, \"温州市\": 0.42857142857142855, \"渭南市\": 0.45, \"湖北省\": 0.7368421052631579, \"湖州市\": 0.49411764705882355, \"湘潭市\": 0.68, \"湘西土家族苗族自治州\": 0.5, \"湛江市\": 0.5384615384615384, \"滁州市\": 0.23529411764705882, \"滨州市\": 0.7111111111111111, \"漯河市\": 0.6111111111111112, \"漳州市\": 0.6013986013986014, \"潍坊市\": 0.5126050420168067, \"潮州市\": 0.21428571428571427, \"澳門特別行政區\": 0.0, \"濮阳市\": 0.68, \"烟台市\": 0.7571428571428571, \"焦作市\": 0.5428571428571428, \"牡丹江市\": 0.7222222222222222, \"玉林市\": 0.6762589928057554, \"玉溪市\": 0.6818181818181818, \"珠海市\": 0.35443037974683544, \"甘南藏族自治州\": 0.5, \"甘孜藏族自治州\": 0.25, \"白城市\": 0.7962962962962963, \"白山市\": 0.6, \"白银市\": 0.5348837209302325, \"百色市\": 0.4722222222222222, \"益阳市\": 0.5294117647058824, \"盐城市\": 0.4166666666666667, \"盘锦市\": 0.375, \"眉山市\": 0.7058823529411765, \"石嘴山市\": 0.7083333333333334, \"石家庄市\": 0.4236453201970443, \"福州市\": 0.48520710059171596, \"秦皇岛市\": 0.5189873417721519, \"红河哈尼族彝族自治州\": 0.6458333333333334, \"绍兴市\": 0.37777777777777777, \"绥化市\": 0.74, \"绵阳市\": 0.75, \"聊城市\": 0.4782608695652174, \"肇庆市\": 0.572463768115942, \"自贡市\": 0.5, \"舟山市\": 0.5, \"芜湖市\": 0.6571428571428571, \"苏州市\": 0.4332129963898917, \"茂名市\": 0.43243243243243246, \"荆州市\": 0.6170212765957447, \"荆门市\": 0.5555555555555556, \"莆田市\": 0.4222222222222222, \"莱芜市\": 0.25, \"菏泽市\": 0.6976744186046512, \"萍乡市\": 0.822429906542056, \"营口市\": 0.696, \"葫芦岛市\": 0.5483870967741935, \"蚌埠市\": 0.4444444444444444, \"衡水市\": 0.5333333333333333, \"衡阳市\": 0.6176470588235294, \"衢州市\": 0.5, \"襄阳市\": 0.6804123711340206, \"西双版纳傣族自治州\": 0.4166666666666667, \"西宁市\": 0.4, \"西安市\": 0.516728624535316, \"许昌市\": 0.7021276595744681, \"贵港市\": 0.5833333333333334, \"贵阳市\": 0.553030303030303, \"贺州市\": 0.6857142857142857, \"资阳市\": 0.3333333333333333, \"赣州市\": 0.4576271186440678, \"赤峰市\": 0.6, \"辽源市\": 0.7083333333333334, \"辽阳市\": 0.7916666666666666, \"达州市\": 0.6190476190476191, \"运城市\": 0.6875, \"连云港市\": 0.5172413793103449, \"迪庆藏族自治州\": 0.6666666666666666, \"通化市\": 0.6875, \"通辽市\": 0.75, \"遂宁市\": 0.5, \"遵义市\": 0.5212765957446809, \"邢台市\": 0.7105263157894737, \"邯郸市\": 0.7407407407407407, \"邵阳市\": 0.4, \"郑州市\": 0.5485436893203883, \"郴州市\": 0.5918367346938775, \"鄂尔多斯市\": 0.6481481481481481, \"鄂州市\": 0.75, \"酒泉市\": 0.7105263157894737, \"重庆市\": 0.5073529411764706, \"金华市\": 0.36363636363636365, \"金昌市\": 0.8333333333333334, \"钦州市\": 0.5294117647058824, \"铁岭市\": 0.8, \"铜仁市\": 0.6666666666666666, \"铜川市\": 0.4, \"铜陵市\": 0.5, \"银川市\": 0.625, \"锡林郭勒盟\": 0.34782608695652173, \"锦州市\": 0.4603174603174603, \"镇江市\": 0.4375, \"长春市\": 0.6839378238341969, \"长沙市\": 0.44571428571428573, \"长治市\": 0.42105263157894735, \"阜新市\": 0.7391304347826086, \"阜阳市\": 0.4074074074074074, \"防城港市\": 0.6842105263157895, \"阳江市\": 0.5813953488372093, \"阳泉市\": 0.2, \"阿坝藏族羌族自治州\": 0.3333333333333333, \"阿拉善盟\": 0.8, \"陇南市\": 0.5, \"随州市\": 0.21428571428571427, \"雅安市\": 0.3333333333333333, \"青岛市\": 0.4025974025974026, \"鞍山市\": 0.6, \"韶关市\": 0.5063291139240507, \"马鞍山市\": 0.5, \"驻马店市\": 0.42857142857142855, \"鸡西市\": 0.6666666666666666, \"鹤壁市\": 0.7222222222222222, \"鹤岗市\": 0.7575757575757576, \"鹰潭市\": 0.2857142857142857, \"黄冈市\": 0.6444444444444445, \"黄南藏族自治州\": 0.0, \"黄山市\": 0.38461538461538464, \"黄石市\": 0.5882352941176471, \"黑河市\": 0.4666666666666667, \"黔东南苗族侗族自治州\": 0.5818181818181818, \"黔南布依族苗族自治州\": 0.38235294117647056, \"黔西南布依族苗族自治州\": 0.45161290322580644, \"齐齐哈尔市\": 0.6981132075471698, \"龙岩市\": 0.6875}], \"brand_x\": [\"brand_x_encoding\", {0: 0.3724340175953079, 360: 0.3382352941176471, \"4G\": 0.0, \"4G+\": 0.5, \"4GVOLTE\": 1.0, \"ASUSTek Computer Inc\": 1.0, \"ATMAN\": 0.0, \"Android\": 1.0, \"Apple\": 0.4057632398753894, \"BBK\": 0.7142857142857143, \"BIFER\": 1.0, \"BIRD\": 1.0, \"BOWAY\": 1.0, \"Bird\": 1.0, \"BlackBerry\": 0.0, \"Blephone\": 0.8, \"CM\": 1.0, \"CMDC\": 0.75, \"COMIO\": 1.0, \"Changhong\": 1.0, \"Coolpad\": 0.4090909090909091, \"DAJ\": 1.0, \"DM\": 1.0, \"DOOV\": 0.7058823529411765, \"DW\": 0.0, \"EBEST\": 0.5, \"ET 600\": 1.0, \"EYU\": 1.0, \"Everest\": 1.0, \"G19\": 1.0, \"GELI\": 1.0, \"GIONEE\": 0.745928338762215, \"GiONEE\": 0.7469879518072289, \"Google\": 0.0, \"Gree\": 0.5, \"GuangXin\": 0.5, \"HMD Global\": 0.6666666666666666, \"HMD Global Oy\": 0.0, \"HTC\": 0.875, \"HUAWEI\": 0.5278386672512057, \"Hisense\": 0.8235294117647058, \"InFocus\": 1.0, \"KDOOR\": 1.0, \"KEJIAN\": 1.0, \"KONKA\": 1.0, \"KOPO\": 0.5, \"LA-S35\": 1.0, \"LENOVO\": 0.9230769230769231, \"LGE\": 0.0, \"LMCV1\": 1.0, \"LeMobile\": 0.5402298850574713, \"Lenovo\": 1.0, \"Letv\": 0.4883720930232558, \"Lingwin\": 0.0, \"MANN\": 1.0, \"MLLED\": 0.0, \"Meitu\": 0.4025974025974026, \"Meizu\": 0.5362595419847328, \"Moneymakingmachine\": 1.0, \"Mytel\": 1.0, \"ONEPLUS\": 1.0, \"OPPO\": 0.609895337773549, \"OPSSON\": 0.0, \"OUJIA\": 1.0, \"OUKI\": 1.0, \"OUKITEL\": 1.0, \"OWWO\": 1.0, \"OnePlus\": 0.04081632653061224, \"PANASONIC\": 0.0, \"Philips\": 1.0, \"Pioneer\": 0.0, \"QiKU\": 0.75, \"QingHuaTongFang\": 1.0, \"Qingcheng\": 0.0, \"SAST\": 1.0, \"SHARP\": 1.0, \"SOP\": 1.0, \"SPRD\": 1.0, \"SUGAR\": 0.8888888888888888, \"Samsung\": 0.0, \"Sony\": 0.6666666666666666, \"SuperD\": 1.0, \"TCL\": 0.3333333333333333, \"UTOUU\": 0.0, \"VVETIME\": 0.0, \"Volte\": 1.0, \"Wingtech\": 0.0, \"X-apple\": 1.0, \"Xiaomi\": 0.4828797190517998, \"YUFLY\": 1.0, \"YUSUN\": 0.0, \"YV\": 0.0, \"YuLong\": 0.7368421052631579, \"Yulong\": 0.8, \"YunMall\": 0.0, \"ZEE\": 1.0, \"ZTE\": 0.725, \"ZUK\": 0.3, \"alps\": 0.8571428571428571, \"asus\": 0.5, \"boway\": 1.0, \"changhong\": 1.0, \"freeme\": 1.0, \"honglajiao\": 1.0, \"i7S&#40;YP7S&#41;\": 0.0, \"koobee\": 1.0, \"lephone\": 1.0, \"meizu\": 0.5714285714285714, \"motorola\": 0.5, \"nubia\": 0.55, \"samsung\": 0.4960212201591512, \"smartisan\": 0.34545454545454546, \"sprd\": 0.75, \"unknown\": 0.0, \"vivo\": 0.6432668043129158, \"weishili\": 1.0, \"xiaolajiao\": 0.75, \"yifengzhanye\": 0.0, \"红辣椒\": 1.0}], \"first_prod_type1_x\": [\"first_prod_type1_x_encoding\", {0: 0.75, \"二手优品\": 0.4605263157894737, \"家居家纺\": 0.4857142857142857, \"家用电器\": 0.4878836833602585, \"情侣服装\": 0.5714285714285714, \"手机通讯\": 0.5611838360842345, \"时尚女装\": 0.5, \"智能数码\": 0.35514018691588783, \"母婴用品\": 0.6363636363636364, \"潮流男装\": 0.40425531914893614, \"珠宝首饰\": 0.6470588235294118, \"电脑平板\": 0.533498759305211, \"箱包潮品\": 0.6022727272727273, \"美妆个护\": 0.32562277580071175, \"腕表配饰\": 0.5309090909090909, \"运动户外\": 0.4871582435791218}], \"first_down_pymt_ratio_x\": [\"first_down_pymt_ratio_x_encoding\", {0.0: 0.5495622568093386, 0.1: 0.2608695652173913, 0.2: 0.14516129032258066, 0.3: 0.125, 0.4: 0.1935483870967742, 0.5: 0.040983606557377046}], \"CDZC009_geo104\": [\"CDZC009_geo104_encoding\", {-999: 0.6830669330669331, 1: 0.16988416988416988, 2: 0.27491408934707906, 3: 0.2808022922636103, 4: 0.5256355019388195, 5: 0.5615658362989324, 6: 0.5018975332068312}]}";
        Map maps = (Map)JSON.parse(merge_bin_dict1);
        System.out.println("这个是用JSON类来解析JSON字符串!!!");
        for (Object map : maps.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());
        }
        //第二种方式
        Map mapTypes = JSON.parseObject(str);
        System.out.println("这个是用JSON类的parseObject来解析JSON字符串!!!");
        for (Object obj : mapTypes.keySet()){
            System.out.println("key为："+obj+"值为："+mapTypes.get(obj));
        }
        //第三种方式
        Map mapType = JSON.parseObject(str,Map.class);
        System.out.println("这个是用JSON类,指定解析类型，来解析JSON字符串!!!");
        for (Object obj : mapType.keySet()){
            System.out.println("key为："+obj+"值为："+mapType.get(obj));
        }
        //第四种方式
        /**
         * JSONObject是Map接口的一个实现类
         */
        Map json = (Map) JSONObject.parse(str);
        System.out.println("这个是用JSONObject类的parse方法来解析JSON字符串!!!");
        for (Object map : json.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());
        }
        //第五种方式
        /**
         * JSONObject是Map接口的一个实现类
         */
        JSONObject jsonObject = JSONObject.parseObject(str);
        System.out.println("这个是用JSONObject的parseObject方法来解析JSON字符串!!!");
        for (Object map : json.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());
        }
        //第六种方式
        /**
         * JSONObject是Map接口的一个实现类
         */
        Map mapObj = JSONObject.parseObject(str,Map.class);
        System.out.println("这个是用JSONObject的parseObject方法并执行返回类型来解析JSON字符串!!!");
        for (Object map: json.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());
        }
        String strArr = "{{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}," +
                "{\"00\":\"zhangsan\",\"11\":\"lisi\",\"22\":\"wangwu\",\"33\":\"maliu\"}}";
        // JSONArray.parse()
        System.out.println(json);
    }
}