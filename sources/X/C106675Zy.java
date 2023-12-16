package X;

import android.util.Pair;
import com.whatsapp.Me;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.5Zy  reason: invalid class name and case insensitive filesystem */
public class C106675Zy {
    public static final Charset A06 = C58152un.A0D;
    public static final Pattern A07 = Pattern.compile("\t");
    public C160507nm A00 = new C160507nm(0);
    public String A01 = "";
    public final C106175Xx A02;
    public final C56972sr A03;
    public final C54292oU A04;
    public final Object A05 = AnonymousClass002.A0D();

    public static String A01(String str, String str2) {
        Pattern pattern;
        try {
            int parseInt = Integer.parseInt(str);
            String str3 = (String) AnonymousClass79A.A01.get(parseInt);
            if (str3 != null) {
                if (!str3.equals("ZZ")) {
                    return str3;
                }
                List list = (List) AnonymousClass79A.A02.get(parseInt);
                for (int i = 0; i < list.size(); i++) {
                    Pair pair = (Pair) list.get(i);
                    Object obj = pair.second;
                    if (obj instanceof String) {
                        pattern = Pattern.compile((String) obj);
                        list.set(i, Pair.create(pair.first, pattern));
                    } else {
                        pattern = (Pattern) obj;
                    }
                    if (C18280x3.A1X(str2, pattern)) {
                        return (String) pair.first;
                    }
                }
            }
            return "ZZ";
        } catch (NumberFormatException unused) {
            return "ZZ";
        }
    }

    public String A02(C620733j r7, String str) {
        String str2;
        synchronized (this.A05) {
            String A042 = C162307rf.A04(C620733j.A02(r7));
            if (!A042.equals(this.A01)) {
                List<AnonymousClass7IS> A032 = A03(A042);
                if (A032.isEmpty()) {
                    A032 = A03("en");
                }
                this.A00 = new C160507nm(A032.size());
                for (AnonymousClass7IS r0 : A032) {
                    this.A00.A03(r0.A00, r0.A01);
                }
                this.A01 = A042;
            }
            str2 = (String) this.A00.A01(str);
        }
        return str2;
    }

    public boolean A04() {
        C56972sr r0 = this.A03;
        r0.A0P();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        try {
            return "eu".equals(this.A02.A03(me.cc));
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("countryutils/is-eu failed for ");
            C18260x0.A15(me.cc, A0o, e);
            return false;
        }
    }

    public boolean A05(String str) {
        C56972sr r0 = this.A03;
        r0.A0P();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        return str.equals(AnonymousClass0x9.A0w(me));
    }

    public C106675Zy(C106175Xx r3, C56972sr r4, C54292oU r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = (String) AnonymousClass79A.A01.get(parseInt);
            if ("ZZ".equals(str2)) {
                return (String) AnonymousClass79A.A00.get(parseInt);
            }
            return str2;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final List A03(String str) {
        BufferedReader bufferedReader;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("country_names_");
        A0o.append(str);
        ArrayList arrayList = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.A04.A00.getAssets().open(AnonymousClass000.A0X(".tsv", A0o)), A06));
            arrayList = AnonymousClass002.A0I(243);
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String[] split = A07.split(readLine);
                C626936e.A0C(AnonymousClass000.A1U(split.length, 2));
                arrayList.add(new AnonymousClass7IS(split[0], split[1]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "countryutils/getcountrylist error:", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
        throw th;
    }
}
