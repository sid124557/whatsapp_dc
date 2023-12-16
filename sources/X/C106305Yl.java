package X;

import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5Yl  reason: invalid class name and case insensitive filesystem */
public class C106305Yl {
    public static final Map A00;
    public static final Integer[] A01;

    public static double[] A01(int i) {
        double d;
        double[] dArr = {((double) ((i >> 16) & 255)) / 255.0d, ((double) ((i >> 8) & 255)) / 255.0d, ((double) (i & 255)) / 255.0d};
        int i2 = 0;
        do {
            double d2 = dArr[i2];
            if (d2 > 0.04045d) {
                d = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            } else {
                d = d2 / 12.92d;
            }
            dArr[i2] = d;
            dArr[i2] = d * 100.0d;
            i2++;
        } while (i2 < 3);
        double d3 = dArr[0];
        double d4 = dArr[1];
        double d5 = dArr[2];
        return new double[]{(0.4124d * d3) + (0.3576d * d4) + (0.1805d * d5), (0.2126d * d3) + (0.7152d * d4) + (0.0722d * d5), (d3 * 0.0193d) + (d4 * 0.1192d) + (d5 * 0.9505d)};
    }

    public static double[] A02(double[] dArr) {
        double d;
        double[] dArr2 = {dArr[0] / 95.047d, dArr[1] / 100.0d, dArr[2] / 108.883d};
        int i = 0;
        do {
            double d2 = dArr2[i];
            if (d2 > 0.008856d) {
                d = Math.pow(d2, 0.3333333333333333d);
            } else {
                d = (d2 * 7.787d) + 0.13793103448275862d;
            }
            dArr2[i] = d;
            i++;
        } while (i < 3);
        double d3 = dArr2[1];
        return new double[]{(116.0d * d3) - 16.0d, (dArr2[0] - d3) * 500.0d, (d3 - dArr2[2]) * 200.0d};
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        Integer A002 = A00(15792383, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A002, A0t, 761085);
        Integer A003 = A00(16444375, A0t, R.string.f11nameremoved);
        Integer A004 = A00(65535, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A004, A0t, 8388564);
        Integer A005 = A00(15794175, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A003, A0t, 16119260);
        AnonymousClass0x2.A1H(A003, A0t, 16770244);
        AnonymousClass0x2.A1I(C18290x4.A0Z(), A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A003, A0t, 16772045);
        Integer A006 = A00(255, A0t, R.string.f11nameremoved);
        Integer A007 = A00(9055202, A0t, R.string.f11nameremoved);
        Integer A008 = A00(10824234, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A003, A0t, 14596231);
        Integer A009 = A00(6266528, A0t, R.string.f11nameremoved);
        Integer A0010 = A00(8388352, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0010, A0t, 6537036);
        Integer A0011 = A00(13789470, A0t, R.string.f11nameremoved);
        Integer A0012 = A00(16744272, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A002, A0t, 6591981);
        Integer A0013 = A00(16775388, A0t, R.string.f11nameremoved);
        Integer A0014 = A00(14423100, A0t, R.string.f11nameremoved);
        Integer A0015 = A00(139, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A009, A0t, 35723);
        AnonymousClass0x2.A1H(A003, A0t, 12092939);
        Integer A0016 = A00(11119017, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1I(25600, A0t, R.string.f11nameremoved);
        Integer A0017 = A00(12433259, A0t, R.string.f11nameremoved);
        Integer A0018 = A00(9109643, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0017, A0t, 5597999);
        AnonymousClass0x2.A1H(A0012, A0t, 16747520);
        AnonymousClass0x2.A1H(A007, A0t, 10040012);
        AnonymousClass0x2.A1H(A008, A0t, 9109504);
        Integer A0019 = A00(16166665, A0t, R.string.f11nameremoved);
        Integer A0020 = A00(15308410, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0017, A0t, 9419919);
        AnonymousClass0x2.A1H(A0018, A0t, 4734347);
        AnonymousClass0x2.A1H(A009, A0t, 3100495);
        AnonymousClass0x2.A1H(A004, A0t, 52945);
        AnonymousClass0x2.A1H(A007, A0t, 9699539);
        Integer A0021 = A00(16716947, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A006, A0t, 49151);
        Integer A0022 = A00(6908265, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A006, A0t, 2003199);
        AnonymousClass0x2.A1H(A008, A0t, 11674146);
        AnonymousClass0x2.A1H(A005, A0t, 16775920);
        Integer A0023 = A00(2263842, A0t, R.string.f11nameremoved);
        Integer A0024 = A00(16711935, A0t, R.string.f11nameremoved);
        Integer A0025 = A00(14474460, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A005, A0t, 16316671);
        A0t.put(16766720, A0019);
        AnonymousClass0x2.A1I(14329120, A0t, R.string.f11nameremoved);
        A0t.put(8421504, A0022);
        AnonymousClass0x2.A1H(A0023, A0t, 32768);
        AnonymousClass0x2.A1H(A0010, A0t, 11403055);
        AnonymousClass0x2.A1H(A0010, A0t, 15794160);
        AnonymousClass0x2.A1H(A0021, A0t, 16738740);
        AnonymousClass0x2.A1H(A0014, A0t, 13458524);
        AnonymousClass0x2.A1I(12201298, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0018, A0t, 4915330);
        AnonymousClass0x2.A1H(A005, A0t, 16777200);
        AnonymousClass0x2.A1H(A0013, A0t, 15787660);
        Integer A0026 = A00(15132410, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1I(16773365, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0010, A0t, 8190976);
        AnonymousClass0x2.A1H(A0013, A0t, 16775885);
        AnonymousClass0x2.A1H(A002, A0t, 11393254);
        Integer A0027 = A00(15761536, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A002, A0t, 14745599);
        AnonymousClass0x2.A1H(A0013, A0t, 16448210);
        AnonymousClass0x2.A1H(A0025, A0t, 13882323);
        AnonymousClass0x2.A1H(A0010, A0t, 9498256);
        AnonymousClass0x2.A1H(A0021, A0t, 16758465);
        AnonymousClass0x2.A1H(A0020, A0t, 16752762);
        AnonymousClass0x2.A1H(A009, A0t, 2142890);
        AnonymousClass0x2.A1H(A002, A0t, 8900346);
        AnonymousClass0x2.A1H(A0016, A0t, 7833753);
        AnonymousClass0x2.A1H(A0025, A0t, 11584734);
        AnonymousClass0x2.A1H(A0013, A0t, 16777184);
        AnonymousClass0x2.A1H(A0023, A0t, 65280);
        AnonymousClass0x2.A1H(A0023, A0t, 3329330);
        AnonymousClass0x2.A1H(A003, A0t, 16445670);
        AnonymousClass0x2.A1H(A008, A0t, 8388608);
        AnonymousClass0x2.A1H(A009, A0t, 6737322);
        AnonymousClass0x2.A1H(A006, A0t, 205);
        AnonymousClass0x2.A1H(A007, A0t, 12211667);
        AnonymousClass0x2.A1H(A007, A0t, 9662683);
        AnonymousClass0x2.A1H(A0023, A0t, 3978097);
        AnonymousClass0x2.A1H(A007, A0t, 8087790);
        AnonymousClass0x2.A1H(A0010, A0t, 64154);
        AnonymousClass0x2.A1H(A004, A0t, 4772300);
        AnonymousClass0x2.A1H(A0024, A0t, 13047173);
        AnonymousClass0x2.A1H(A0015, A0t, 1644912);
        AnonymousClass0x2.A1H(A0010, A0t, 16121850);
        AnonymousClass0x2.A1H(A0021, A0t, 16770273);
        AnonymousClass0x2.A1H(A003, A0t, 16770229);
        AnonymousClass0x2.A1H(A003, A0t, 16768685);
        AnonymousClass0x2.A1H(A0015, A0t, 128);
        AnonymousClass0x2.A1H(A003, A0t, 16643558);
        AnonymousClass0x2.A1H(A0017, A0t, 8421376);
        AnonymousClass0x2.A1H(A0017, A0t, 7048739);
        AnonymousClass0x2.A1H(A0012, A0t, 16753920);
        AnonymousClass0x2.A1H(A0011, A0t, 15881513);
        AnonymousClass0x2.A1H(A0014, A0t, 16729344);
        AnonymousClass0x2.A1H(A0026, A0t, 14315734);
        AnonymousClass0x2.A1H(A003, A0t, 15657130);
        AnonymousClass0x2.A1H(A0010, A0t, 10025880);
        AnonymousClass0x2.A1H(A002, A0t, 11529966);
        AnonymousClass0x2.A1H(A0021, A0t, 14381203);
        AnonymousClass0x2.A1H(A003, A0t, 16773077);
        AnonymousClass0x2.A1H(A003, A0t, 16767673);
        Integer A0028 = A00(13468991, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0021, A0t, 16761035);
        AnonymousClass0x2.A1H(A0026, A0t, 14524637);
        AnonymousClass0x2.A1H(A002, A0t, 11591910);
        AnonymousClass0x2.A1H(A007, A0t, 8388736);
        AnonymousClass0x2.A1H(A007, A0t, 6697881);
        AnonymousClass0x2.A1H(A0014, A0t, 16711680);
        AnonymousClass0x2.A1H(A0027, A0t, 12357519);
        AnonymousClass0x2.A1H(A006, A0t, 4286945);
        AnonymousClass0x2.A1H(A0028, A0t, 9127187);
        AnonymousClass0x2.A1H(A0014, A0t, 16416882);
        AnonymousClass0x2.A1H(A0020, A0t, 16032864);
        AnonymousClass0x2.A1H(A0023, A0t, 3050327);
        AnonymousClass0x2.A1H(A005, A0t, 16774638);
        AnonymousClass0x2.A1H(A0028, A0t, 10506797);
        AnonymousClass0x2.A1H(A0016, A0t, 12632256);
        AnonymousClass0x2.A1H(A002, A0t, 8900331);
        AnonymousClass0x2.A1H(A007, A0t, 6970061);
        AnonymousClass0x2.A1H(A0016, A0t, 7372944);
        AnonymousClass0x2.A1H(A005, A0t, 16775930);
        AnonymousClass0x2.A1H(A0023, A0t, 65407);
        AnonymousClass0x2.A1H(A006, A0t, 4620980);
        AnonymousClass0x2.A1H(A003, A0t, 13808780);
        AnonymousClass0x2.A1H(A009, A0t, 32896);
        AnonymousClass0x2.A1H(A0021, A0t, 14204888);
        AnonymousClass0x2.A1H(A0014, A0t, 16737095);
        AnonymousClass0x2.A1H(A002, A0t, 4251856);
        AnonymousClass0x2.A1H(A0021, A0t, 15631086);
        AnonymousClass0x2.A1H(A003, A0t, 16113331);
        AnonymousClass0x2.A1H(A005, A0t, 16777215);
        AnonymousClass0x2.A1H(A0025, A0t, 16119285);
        AnonymousClass0x2.A1H(A0019, A0t, 16776960);
        AnonymousClass0x2.A1H(A0010, A0t, 10145074);
        AnonymousClass0x2.A1H(A002, A0t, 39398);
        AnonymousClass0x2.A1I(33217, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A006, A0t, 1603570);
        AnonymousClass0x2.A1H(A0010, A0t, 3252812);
        AnonymousClass0x2.A1H(A0023, A0t, 2393404);
        AnonymousClass0x2.A1H(A009, A0t, 630409);
        AnonymousClass0x2.A1H(A007, A0t, 8474087);
        AnonymousClass0x2.A1I(16537462, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0011, A0t, 15551028);
        AnonymousClass0x2.A1H(A0012, A0t, 15427085);
        AnonymousClass0x2.A1H(A0014, A0t, 15738953);
        AnonymousClass0x2.A1H(A0021, A0t, 15548837);
        AnonymousClass0x2.A1I(13725460, A0t, R.string.f11nameremoved);
        AnonymousClass0x2.A1H(A0028, A0t, 11883520);
        A01 = (Integer[]) A0t.keySet().toArray(new Integer[A0t.size()]);
    }

    public static Integer A00(Object obj, AbstractMap abstractMap, int i) {
        Integer valueOf = Integer.valueOf(i);
        abstractMap.put(obj, valueOf);
        return valueOf;
    }
}
