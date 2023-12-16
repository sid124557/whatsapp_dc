package X;

import android.text.SpannableStringBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InvalidObjectException;
import java.net.URL;
import java.util.LinkedHashMap;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.0xA  reason: invalid class name and case insensitive filesystem */
public final class C18330xA {
    public static Double A07(long j) {
        return Double.valueOf((double) j);
    }

    public static int[] A0E() {
        return new int[1];
    }

    public static SpannableStringBuilder A00(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static AnonymousClass08M A01(Object obj) {
        return new AnonymousClass08M(obj);
    }

    public static C13750ng A02(AnonymousClass4GP r1, AnonymousClass4GP r2, AnonymousClass4GP r3, C85424Ge r4) {
        return new C13750ng(r1, r2, r3, r4);
    }

    public static C116885r1 A03(C08310eF r1) {
        return new C116885r1(r1);
    }

    public static File A04(String str, String str2) {
        return new File(str, str2);
    }

    public static FileNotFoundException A05(String str) {
        return new FileNotFoundException(str);
    }

    public static InvalidObjectException A06(String str) {
        return new InvalidObjectException(str);
    }

    public static Object A08(C166557yt r0) {
        Object obj = r0.A00;
        C626936e.A06(obj);
        return obj;
    }

    public static RuntimeException A09(Throwable th) {
        return new RuntimeException(th);
    }

    public static StringBuilder A0A(String str) {
        return new StringBuilder(str);
    }

    public static URL A0B(String str) {
        return new URL(str);
    }

    public static LinkedHashMap A0C(int i) {
        return new LinkedHashMap(i);
    }

    public static IvParameterSpec A0D(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }
}
