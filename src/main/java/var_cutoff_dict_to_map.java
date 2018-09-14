import com.alibaba.fastjson.JSON;

import java.util.*;

public class var_cutoff_dict_to_map {

    public static Map get_var_cutoff_M(){
        String var_cutoff_dict = "{\"td_score_x\": [9.0], \"C_app_date\": [17.0], \"GEO_SCORE_geo104\": [-999, 443.0, 517.0, 571.0], \"CDZC001_geo104\": [-999, 0.843268574, 0.888561019, 0.93627759], \"CDZC017_geo104\": [-999, 2, 5, 9], \"CDZC002_geo104\": [-999, 2, 6], \"CDZC003_geo104\": [-999, 1, 4], \"CDZC004_geo104\": [-999, 2, 5], \"CDZC005_geo104\": [-999, 1], \"CDZC006_geo104\": [-999, 1, 7], \"CDZC007_geo104\": [-999, 1], \"CDZC008_geo104\": [-999, 2, 6], \"CDZC010_geo104\": [-999, 5, 9], \"org_count_mz\": [-999, 4, 20], \"other_count_mz\": [-999, 5.0], \"queried_detail_org_count_mz\": [-999, 4, 36], \"cash_loan_15d_mz\": [-999, 1, 9], \"cash_loan_30d_mz\": [-999, 1, 4], \"cash_loan_90d_mz\": [-999, 11], \"cash_loan_180d_mz\": [-999, 11, 45], \"datacoverge_180d_mz\": [-999, 0, 2], \"suspicious_idcard_information_so_mz\": [-999, 2, 8], \"suspicious_mobile_information_so_mz\": [-999, 7, 18], \"match_score_mz\": [-999, 30.2219829579416, 65.6262997668188, 93.7616695698104], \"contactnum_180d_mz\": [-999, 114.0, 159.0, 262.0], \"intimatenum_180d_mz\": [-999, 22.0, 38.0, 66.0], \"auth_contactnum_180d_mz\": [-999, 7.0, 11.0, 20.0], \"black_contactnum_180d_mz\": [-999, 0, 2], \"auth_intimatenum_180d_mz\": [-999, 2, 10], \"black_intimatenum_180d_mz\": [-999, 0, 2], \"contactnum_90d_mz\": [-999, 58.0, 81.0, 141.0], \"intimatenum_90d_mz\": [-999, 14.0, 48.0], \"auth_contactnum_90d_mz\": [-999, 2.0, 8.0, 15.0], \"black_contactnum_90d_mz\": [-999, 0, 2], \"auth_intimatenum_90d_mz\": [-999, 2, 5, 16], \"black_intimatenum_90d_mz\": [-999, 0, 2], \"contactnum_30d_mz\": [-999, 19.0, 47.0, 103.0], \"intimatenum_30d_mz\": [-999, 11.0, 25.0, 36.0], \"auth_contactnum_30d_mz\": [-999, 4, 9], \"black_contactnum_30d_mz\": [-999, 0, 1], \"auth_intimatenum_30d_mz\": [-999, 0, 2, 5], \"black_intimatenum_30d_mz\": [-999, 0, 1], \"auth_indirectnum_180d_mz\": [-999, 4.0, 43.0, 240.0], \"auth_indirectpeernum_180d_mz\": [-999, 0.0, 9.0, 16.0], \"black_indirectnum_180d_mz\": [-999, 0.0, 6.0, 27.0], \"black_indirectpeernum_180d_mz\": [-999, 1.0, 6.0, 14.0], \"auth_intimate_indirectnum_180d_mz\": [-999, 9.0, 28.0, 91.0], \"auth_intimate_indirectpeernum_18_mz\": [-999, 0, 6, 16], \"black_intimate_indirectnum_180d_mz\": [-999, 0.0, 2.0, 14.0], \"black_intimate_indirectpeernum_1_mz\": [-999, 0, 2, 7], \"auth_indirectnum_90d_mz\": [-999, 2.0, 34.0, 170.0], \"auth_indirectpeernum_90d_mz\": [-999, 0.0, 3.0, 10.0], \"black_indirectnum_90d_mz\": [-999, 0.0, 7.0, 19.0], \"black_indirectpeernum_90d_mz\": [-999, 1, 7], \"auth_intimate_indirectnum_90d_mz\": [-999, 4.0, 18.0, 45.0], \"auth_intimate_indirectpeernum_90_mz\": [-999, 0, 3, 8], \"black_intimate_indirectnum_90d_mz\": [-999, 0, 1, 6], \"black_intimate_indirectpeernum_9_mz\": [-999, 0, 1, 4], \"auth_indirectnum_30d_mz\": [-999, 2.0, 29.0, 101.0], \"auth_indirectpeernum_30d_mz\": [-999, 0, 4], \"black_indirectnum_30d_mz\": [-999, 0, 9], \"black_indirectpeernum_30d_mz\": [-999, 0, 1], \"auth_intimate_indirectnum_30d_mz\": [-999, 0.0, 4.0, 23.0], \"auth_intimate_indirectpeernum_30_mz\": [-999, 0, 2, 6], \"black_intimate_indirectnum_30d_mz\": [-999, 0, 3], \"black_intimate_indirectpeernum_3_mz\": [-999, 0, 3], \"auth_contactnum_ratio_180d_mz\": [-999, 0.02325581395348, 0.05, 0.10752688172043], \"black_contactnum_ratio_180d_mz\": [-999, 0.00385208012326, 0.00650759219088, 0.01293103448275], \"auth_indirectnum_ratio_180d_mz\": [-999, 0.03940886699507, 0.07697121401752, 0.10048266783677], \"black_indirectnum_ratio_180d_mz\": [-999, 0.00232342007434, 0.00462962962962, 0.00675182481751], \"black_indirect_peernum_ratio_180_mz\": [-999, 0.01449275362318, 0.03846153846153, 0.06349206349206], \"auth_indirect_peernum_ratio_180d_mz\": [-999, 0.00371747211895, 0.04895104895104, 0.10050251256281], \"auth_intimatenum_ratio_180d_mz\": [-999, 0.07317073170731, 0.125, 0.2], \"black_intimatenum_ratio_180d_mz\": [-999, 0.0, 0.02105263157894], \"auth_intimate_indirectnum_ratio__mz\": [-999, 0.05494505494505, 0.13333333333333], \"black_intimate_indirectnum_ratio_mz\": [-999, 0.00210084033613, 0.00789265982636, 0.01282051282051], \"black_intimate_indirect_peernum__mz\": [-999, 0.0, 0.03125, 0.08333333333333], \"auth_intimate_indirect_peernum_r_mz\": [-999, 0.0, 0.07317073170731, 0.16666666666666], \"auth_contactnum_ratio_90d_mz\": [-999, 0.0379746835443, 0.07692307692307, 0.12359550561797], \"black_contactnum_ratio_90d_mz\": [-999, 0.00375939849624, 0.00961538461538, 0.01694915254237], \"auth_indirectnum_ratio_90d_mz\": [-999, 0.05121293800539, 0.0880327163151], \"black_indirectnum_ratio_90d_mz\": [-999, 0.00106044538706, 0.00582362728785], \"black_indirect_peernum_ratio_90d_mz\": [-999, 0.01086956521739, 0.02272727272727, 0.05263157894736], \"auth_indirect_peernum_ratio_90d_mz\": [-999, 0.03669724770642, 0.0603448275862, 0.11864406779661], \"auth_intimatenum_ratio_90d_mz\": [-999, 0.07843137254901, 0.14285714285714, 0.22222222222222], \"black_intimatenum_ratio_90d_mz\": [-999, 0.0, 0.01851851851851], \"auth_intimate_indirectnum_r_0001_mz\": [-999, 0.05491990846681, 0.15648854961832], \"black_intimate_indirectnum__0001_mz\": [-999, 0.00178253119429, 0.008356545961], \"black_intimate_indirect_pee_0001_mz\": [-999, 0.01492537313432, 0.04545454545454, 0.125], \"auth_intimate_indirect_peer_0001_mz\": [-999, 0.0, 0.07692307692307, 0.21875], \"auth_contactnum_ratio_30d_mz\": [-999, 0.02666666666666, 0.05882352941176, 0.13157894736842], \"black_contactnum_ratio_30d_mz\": [-999, 0.00719424460431, 0.01428571428571, 0.02702702702702], \"auth_indirectnum_ratio_30d_mz\": [-999, 0.05357142857142, 0.13157894736842], \"black_indirectnum_ratio_30d_mz\": [-999, 0.0, 0.00728155339805], \"black_indirect_peernum_ratio_30d_mz\": [-999, 0.00724637681159, 0.02173913043478, 0.04477611940298], \"auth_indirect_peernum_ratio_30d_mz\": [-999, 0.01290322580645, 0.05416666666666, 0.14], \"auth_intimatenum_ratio_30d_mz\": [-999, 0.07692307692307, 0.13333333333333, 0.22222222222222], \"black_intimatenum_ratio_30d_mz\": [-999, 0.0, 0.02222222222222], \"auth_intimate_indirectnum_r_0002_mz\": [-999, 0.03030303030303, 0.14814814814814], \"black_intimate_indirectnum__0002_mz\": [-999, 0.0, 0.02317290552584], \"black_intimate_indirect_pee_0002_mz\": [-999, 0.0, 0.03333333333333, 0.14285714285714], \"auth_intimate_indirect_peer_0002_mz\": [-999, 0.03703703703703, 0.16666666666666, 0.25], \"huomou_score\": [-999, 540.0, 617.0, 694.0], \"TX_score\": [44, 57, 64, 73], \"TD_Fraud_score\": [6, 9, 14, 23], \"C_city_x_encoding\": [0.417910447761194, 0.5, 0.631578947368421, 0.71875], \"brand_x_encoding\": [0.43478260869565216, 0.5609756097560976], \"CDZC009_geo104_encoding\": [0.5053291536050156, 0.5483074753173484], \"idcard_location_mz_encoding\": [0.34146341463414637, 0.453125, 0.5862068965517241, 0.7017543859649122], \"mobile_location_mz_encoding\": [0.4305555555555556, 0.5105263157894737, 0.64, 0.75], \"org_types_mz_encoding\": [0.42857142857142855, 0.5555555555555556, 0.6268656716417911], \"diversion_90d_mz_encoding\": [0.3624610964807278, 0.5540334855403348], \"diversion_180d_mz_encoding\": [0.4, 0.5655172413793104], \"zhengxin_180d_mz_encoding\": [0.3624610964807278, 0.5815555284651956], \"datacoverge_30d_mz_encoding\": [0.3624610964807278, 0.5842942104624348], \"datacoverge_90d_mz_encoding\": [0.3624610964807278, 0.5702614379084967], \"consumstage_15d_mz_encoding\": [0.3624610964807278, 0.581115933823992], \"consumstage_30d_mz_encoding\": [0.3624610964807278, 0.5803645666773265], \"consumstage_90d_mz_encoding\": [0.3624610964807278, 0.581714889681596], \"consumstage_180d_mz_encoding\": [0.3624610964807278, 0.625], \"p2p_90d_mz_encoding\": [0.3624610964807278, 0.5096582466567607], \"p2p_180d_mz_encoding\": [0.3793103448275862, 0.5259336099585062], \"other_15d_mz_encoding\": [0.3624610964807278, 0.5841476655808904], \"other_30d_mz_encoding\": [0.3624610964807278, 0.5842185128983308], \"other_90d_mz_encoding\": [0.3624610964807278, 0.576530612244898], \"other_180d_mz_encoding\": [0.3624610964807278, 0.565729234793983], \"suspicious_idcard_other_mobiles__mz_encoding\": [0.3724705359128308, 0.556911541836165], \"suspicious_idcard_other_mob_0001_mz_encoding\": [0.3724705359128308, 0.5824004975124378], \"suspicious_mobile_other_names_cn_mz_encoding\": [0.43434521708436286, 0.5778797552540569], \"suspicious_mobile_other_idcards__mz_encoding\": [0.43434521708436286, 0.577598385469223], \"sex_age_encoding\": [0.3857442348008386, 0.5219882055602358, 0.625615763546798]}";
//        System.out.println(C_city_x);
        Map var_cutoff_dict_M = JSON.parseObject(var_cutoff_dict);
        Map var_cutoff_dict_M_ = var_cutoff_dict_M;
        for (Object entry:var_cutoff_dict_M.keySet()
        ) {
            List<String> list_ = new ArrayList( Arrays.asList(var_cutoff_dict_M.get(entry).toString().split("\\,|\\[|\\]")));
            list_.remove(0);
            float[] list__ = new float[list_.size()];
            for(int i=0;i<list_.size();i++){
                list__[i] = Float.parseFloat(list_.get(i));
            }
//            System.out.println(list__);
//            Float[] list__ = list_.toArray(new Float[list_.size()]);

            var_cutoff_dict_M_.put(entry,list__);

        }

        return var_cutoff_dict_M_;
    }
    public static void main(String[] args){
        Map var_cutoff_dict_M = get_var_cutoff_M();
        System.out.println("这个是用JSON类的parseObject来解析JSON字符串!!!");
        for (Object obj : var_cutoff_dict_M.keySet()){
            System.out.println("key为："+obj+"值为："+var_cutoff_dict_M.get(obj));
        }

    }
}