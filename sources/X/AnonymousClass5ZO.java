package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5ZO  reason: invalid class name */
public class AnonymousClass5ZO {
    public int A00 = -1;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final Double A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass5ZO r5 = (AnonymousClass5ZO) obj;
        Double d = this.A04;
        Double d2 = r5.A04;
        if (d != null ? d.equals(d2) : d2 == null) {
            Double d3 = this.A05;
            Double d4 = r5.A05;
            if (d3 != null ? d3.equals(d4) : d4 == null) {
                Double d5 = this.A02;
                Double d6 = r5.A02;
                if (d5 != null ? d5.equals(d6) : d6 == null) {
                    Double d7 = this.A03;
                    Double d8 = r5.A03;
                    if (d7 != null ? d7.equals(d8) : d8 == null) {
                        if (this.A09.equals(r5.A09)) {
                            Double d9 = this.A01;
                            Double d10 = r5.A01;
                            if (d9 != null ? d9.equals(d10) : d10 == null) {
                                String str = this.A07;
                                String str2 = r5.A07;
                                if (str == null) {
                                    return str2 == null;
                                }
                                if (str.equals(str2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static LatLng A00(AnonymousClass5ZO r5) {
        Double d = r5.A04;
        C626936e.A06(d);
        double doubleValue = d.doubleValue();
        Double d2 = r5.A05;
        C626936e.A06(d2);
        return new LatLng(doubleValue, d2.doubleValue());
    }

    public int A04() {
        String str;
        String str2 = this.A09;
        switch (str2.hashCode()) {
            case -1335157162:
                str = "device";
                break;
            case -1207360282:
                if (str2.equals("pin_on_map")) {
                    return 3;
                }
                break;
            case -1081415738:
                if (str2.equals("manual")) {
                    return 1;
                }
                break;
            case 1738549583:
                str = "nearest_neighborhood";
                break;
        }
        if (str2.equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean A07() {
        String str = this.A09;
        if (str.equals("country_default") || str.equals("approx_default")) {
            return true;
        }
        return false;
    }

    public boolean A08() {
        String str = this.A09;
        if ("city_default".equals(str) || "country_default".equals(str) || "manual".equals(str) || "nearest_neighborhood".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A09() {
        String str = this.A09;
        if ("pin_on_map".equals(str)) {
            return true;
        }
        if (!"device".equals(str)) {
            return false;
        }
        Double d = this.A06;
        C626936e.A06(d);
        if (d.doubleValue() - 800.0d <= 200.0d) {
            return true;
        }
        Double d2 = this.A01;
        if (d2 == null || d2.doubleValue() > 200.0d) {
            return false;
        }
        return true;
    }

    public boolean A0A() {
        String str = this.A09;
        if ("device".equals(str) || "pin_on_map".equals(str) || "map_view".equals(str)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Double d = this.A04;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode() * 43;
        }
        Double d2 = this.A05;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode() * 43;
        }
        int i2 = hashCode + hashCode2;
        Double d3 = this.A02;
        if (d3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d3.hashCode() * 43;
        }
        int i3 = i2 + hashCode3;
        Double d4 = this.A03;
        if (d4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d4.hashCode() * 43;
        }
        int hashCode6 = i3 + hashCode4 + (this.A09.hashCode() * 43);
        Double d5 = this.A01;
        if (d5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = d5.hashCode() * 43;
        }
        int i4 = hashCode6 + hashCode5;
        String str = this.A07;
        if (str != null) {
            i = str.hashCode() * 43;
        }
        return i4 + i;
    }

    public AnonymousClass5ZO(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, String str, String str2, String str3) {
        this.A06 = d;
        this.A04 = d2;
        this.A05 = d3;
        this.A02 = d4;
        this.A03 = d5;
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A01 = d6;
    }

    public static AnonymousClass5ZO A02(String str) {
        Double d;
        Double d2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            Double A0h = C86654Ky.A0h("radius", A1H);
            Double A0h2 = C86654Ky.A0h("latitude", A1H);
            Double A0h3 = C86654Ky.A0h("longitude", A1H);
            int optInt = A1H.optInt("imprecise_tile_level", -1);
            double optDouble = A1H.optDouble("imprecise_latitude", -1.0d);
            double optDouble2 = A1H.optDouble("imprecise_longitude", -1.0d);
            String optString = A1H.optString("location_description");
            String string = A1H.getString("provider");
            Double A0h4 = C86654Ky.A0h("accuracy", A1H);
            String optString2 = A1H.optString("country_code");
            if (optDouble == -1.0d) {
                d = null;
            } else {
                d = Double.valueOf(optDouble);
            }
            if (optDouble2 == -1.0d) {
                d2 = null;
            } else {
                d2 = Double.valueOf(optDouble2);
            }
            AnonymousClass5ZO r10 = new AnonymousClass5ZO(A0h, A0h2, A0h3, d, d2, A0h4, optString, optString2, string);
            r10.A00 = optInt;
            return r10;
        } catch (JSONException e) {
            Log.i("SearchLocation/fromJsonString Invalid search location string", e);
            return null;
        }
    }

    public static Integer A03(AnonymousClass5ZO r0) {
        return Integer.valueOf(r0.A04());
    }

    public AnonymousClass5ZO A05(double d) {
        return new AnonymousClass5ZO(Double.valueOf(d), this.A04, this.A05, this.A02, this.A03, this.A01, this.A08, this.A07, this.A09);
    }

    public String A06() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("radius", this.A06);
        A1G.put("latitude", this.A04);
        A1G.put("longitude", this.A05);
        A1G.put("imprecise_tile_level", this.A00);
        A1G.put("imprecise_latitude", this.A02);
        A1G.put("imprecise_longitude", this.A03);
        A1G.put("location_description", this.A08);
        A1G.put("provider", this.A09);
        A1G.put("accuracy", this.A01);
        A1G.put("country_code", this.A07);
        return A1G.toString();
    }

    public static AnonymousClass5ZO A01() {
        return new AnonymousClass5ZO(Double.valueOf(2800.0d), Double.valueOf(-23.533773d), Double.valueOf(-46.62529d), (Double) null, (Double) null, (Double) null, "São Paulo", (String) null, "city_default");
    }
}
