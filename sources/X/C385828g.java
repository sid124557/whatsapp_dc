package X;

import com.whatsapp.R;

/* renamed from: X.28g  reason: invalid class name and case insensitive filesystem */
public class C385828g {
    public static int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            switch (lowerCase.hashCode()) {
                case -2139208497:
                    z = lowerCase.equals("misleading");
                    i = R.string.f11nameremoved;
                    break;
                case -1771213723:
                    z = lowerCase.equals("gambling");
                    i = R.string.f11nameremoved;
                    break;
                case -1560609346:
                    z = lowerCase.equals("digital_services_products");
                    i = R.string.f11nameremoved;
                    break;
                case -1338910485:
                    z = lowerCase.equals("dating");
                    i = R.string.f11nameremoved;
                    break;
                case -1152426539:
                    z = lowerCase.equals("tobacco");
                    i = R.string.f11nameremoved;
                    break;
                case -919668978:
                    z = lowerCase.equals("alcohol");
                    i = R.string.f11nameremoved;
                    break;
                case -856935945:
                    z = lowerCase.equals("animals");
                    i = R.string.f11nameremoved;
                    break;
                case -850113115:
                    z = lowerCase.equals("body_parts_fluids");
                    i = R.string.f11nameremoved;
                    break;
                case -596951334:
                    z = lowerCase.equals("supplements");
                    i = R.string.f11nameremoved;
                    break;
                case -371061680:
                    z = lowerCase.equals("illegal_products_services");
                    i = R.string.f11nameremoved;
                    break;
                case 3536713:
                    z = lowerCase.equals("spam");
                    i = R.string.f11nameremoved;
                    break;
                case 92676538:
                    z = lowerCase.equals("adult");
                    i = R.string.f11nameremoved;
                    break;
                case 306174265:
                    z = lowerCase.equals("violation_drugs");
                    i = R.string.f11nameremoved;
                    break;
                case 329032921:
                    z = lowerCase.equals("unauthorized_media");
                    i = R.string.f11nameremoved;
                    break;
                case 908259181:
                    z = lowerCase.equals("healthcare");
                    i = R.string.f11nameremoved;
                    break;
                case 1155840218:
                    z = lowerCase.equals("real_fake_currency");
                    i = R.string.f11nameremoved;
                    break;
                case 1223328215:
                    z = lowerCase.equals("weapons");
                    i = R.string.f11nameremoved;
                    break;
                case 1659800405:
                    z = lowerCase.equals("violent_content");
                    i = R.string.f11nameremoved;
                    break;
                case 1945443043:
                    z = lowerCase.equals("third_party_infringement");
                    i = R.string.f11nameremoved;
                    break;
            }
            if (!z) {
                return R.string.f11nameremoved;
            }
            return i;
        }
        return R.string.f11nameremoved;
    }
}
