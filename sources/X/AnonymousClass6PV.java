package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6PV  reason: invalid class name */
public final class AnonymousClass6PV extends C126516Og {
    public final C161667qC A00 = new C161667qC();
    public final C161467pi A01 = new C161467pi();

    public AnonymousClass6PV() {
        super("WebvttDecoder");
    }

    public C185358tW A04(byte[] bArr, int i, boolean z) {
        char c;
        C148687Ji A012;
        int i2;
        C161467pi r4 = this.A01;
        r4.A0U(bArr, i);
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            int i3 = r4.A01;
            String A0M = r4.A0M();
            if (A0M == null || !A0M.startsWith("WEBVTT")) {
                r4.A0S(i3);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Expected WEBVTT. Got ");
                throw AnonymousClass6u7.A01(AnonymousClass000.A0X(r4.A0M(), A0o));
            }
            do {
            } while (!TextUtils.isEmpty(r4.A0M()));
            ArrayList A0s2 = AnonymousClass001.A0s();
            while (true) {
                int i4 = r4.A01;
                String A0M2 = r4.A0M();
                if (A0M2 == null) {
                    c = 0;
                } else if ("STYLE".equals(A0M2)) {
                    c = 2;
                } else {
                    boolean startsWith = A0M2.startsWith("NOTE");
                    c = 3;
                    if (startsWith) {
                        c = 1;
                    }
                }
                r4.A0S(i4);
                if (c == 0) {
                    return new AnonymousClass88L(A0s2);
                }
                if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(r4.A0M()));
                } else if (c != 2) {
                    String A0M3 = r4.A0M();
                    if (A0M3 != null) {
                        Pattern pattern = C161857qf.A02;
                        Matcher matcher = pattern.matcher(A0M3);
                        if (matcher.matches()) {
                            A012 = C161857qf.A01(r4, (String) null, A0s, matcher);
                        } else {
                            String A0M4 = r4.A0M();
                            if (A0M4 != null) {
                                Matcher matcher2 = pattern.matcher(A0M4);
                                if (matcher2.matches()) {
                                    A012 = C161857qf.A01(r4, A0M3.trim(), A0s, matcher2);
                                }
                            }
                        }
                        if (A012 != null) {
                            A0s2.add(A012);
                        }
                    }
                } else if (A0s2.isEmpty()) {
                    r4.A0M();
                    C161667qC r1 = this.A00;
                    StringBuilder sb = r1.A01;
                    sb.setLength(0);
                    int i5 = r4.A01;
                    do {
                    } while (!TextUtils.isEmpty(r4.A0M()));
                    C161467pi r8 = r1.A00;
                    r8.A0U(r4.A02, r4.A01);
                    r8.A0S(i5);
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    while (true) {
                        C161667qC.A02(r8);
                        String str = null;
                        if (C161467pi.A00(r8) < 5 || !"::cue".equals(r8.A0O(5))) {
                            break;
                        }
                        int i6 = r8.A01;
                        String A013 = C161667qC.A01(r8, sb);
                        if (A013 != null) {
                            if (!"{".equals(A013)) {
                                if ("(".equals(A013)) {
                                    int i7 = r8.A01;
                                    int i8 = i7;
                                    int i9 = r8.A00;
                                    boolean z2 = false;
                                    while (i7 < i9 && !z2) {
                                        z2 = AnonymousClass000.A1U((char) r8.A02[i7], 41);
                                        i7++;
                                    }
                                    str = r8.A0O((i7 - 1) - i8).trim();
                                }
                                if (")".equals(C161667qC.A01(r8, sb))) {
                                    if (str == null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                r8.A0S(i6);
                                str = "";
                            }
                            if (!"{".equals(C161667qC.A01(r8, sb))) {
                                break;
                            }
                            AnonymousClass7QE r2 = new AnonymousClass7QE();
                            if (!"".equals(str)) {
                                int indexOf = str.indexOf(91);
                                if (indexOf != -1) {
                                    Matcher matcher3 = C161667qC.A02.matcher(str.substring(indexOf));
                                    if (matcher3.matches()) {
                                        r2.A09 = AnonymousClass6C8.A0f(matcher3, 1);
                                    }
                                    str = str.substring(0, indexOf);
                                }
                                String[] split = str.split("\\.", -1);
                                String str2 = split[0];
                                int indexOf2 = str2.indexOf(35);
                                if (indexOf2 != -1) {
                                    r2.A08 = str2.substring(0, indexOf2);
                                    r2.A07 = AnonymousClass6C9.A0c(indexOf2, str2);
                                } else {
                                    r2.A08 = str2;
                                }
                                int length = split.length;
                                if (length > 1) {
                                    boolean z3 = true;
                                    if (length > length) {
                                        z3 = false;
                                    }
                                    C161487pm.A03(z3);
                                    r2.A0A = C18280x3.A0h(Arrays.copyOfRange(split, 1, length));
                                }
                            }
                            String str3 = null;
                            boolean z4 = false;
                            while (!z4) {
                                int i10 = r8.A01;
                                str3 = C161667qC.A01(r8, sb);
                                if (str3 == null || "}".equals(str3)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                    r8.A0S(i10);
                                    C161667qC.A02(r8);
                                    String A002 = C161667qC.A00(r8, sb);
                                    if (!"".equals(A002) && ":".equals(C161667qC.A01(r8, sb))) {
                                        C161667qC.A02(r8);
                                        StringBuilder A0o2 = AnonymousClass001.A0o();
                                        while (true) {
                                            i2 = r8.A01;
                                            String A014 = C161667qC.A01(r8, sb);
                                            if (A014 == null) {
                                                break;
                                            } else if ("}".equals(A014) || ";".equals(A014)) {
                                                r8.A0S(i2);
                                                String obj = A0o2.toString();
                                            } else {
                                                A0o2.append(A014);
                                            }
                                        }
                                        r8.A0S(i2);
                                        String obj2 = A0o2.toString();
                                        if (obj2 != null && !"".equals(obj2)) {
                                            int i11 = r8.A01;
                                            String A015 = C161667qC.A01(r8, sb);
                                            if (!";".equals(A015)) {
                                                if ("}".equals(A015)) {
                                                    r8.A0S(i11);
                                                }
                                            }
                                            if ("color".equals(A002)) {
                                                r2.A02 = C155547f5.A00(obj2, true);
                                                r2.A0D = true;
                                            } else if ("background-color".equals(A002)) {
                                                r2.A00 = C155547f5.A00(obj2, true);
                                                r2.A0C = true;
                                            } else {
                                                boolean z5 = true;
                                                if ("ruby-position".equals(A002)) {
                                                    if ("over".equals(obj2)) {
                                                        r2.A04 = 1;
                                                    } else if ("under".equals(obj2)) {
                                                        r2.A04 = 2;
                                                    }
                                                } else if ("text-combine-upright".equals(A002)) {
                                                    if (!"all".equals(obj2) && !obj2.startsWith("digits")) {
                                                        z5 = false;
                                                    }
                                                    r2.A0B = z5;
                                                } else if ("text-decoration".equals(A002)) {
                                                    if ("underline".equals(obj2)) {
                                                        r2.A05 = 1;
                                                    }
                                                } else if ("font-family".equals(A002)) {
                                                    r2.A06 = AnonymousClass0x9.A0z(obj2);
                                                } else if ("font-weight".equals(A002)) {
                                                    if ("bold".equals(obj2)) {
                                                        r2.A01 = 1;
                                                    }
                                                } else if ("font-style".equals(A002) && "italic".equals(obj2)) {
                                                    r2.A03 = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if ("}".equals(str3)) {
                                A0s3.add(r2);
                            }
                        } else {
                            break;
                        }
                    }
                    A0s.addAll(A0s3);
                } else {
                    throw new AnonymousClass6OY("A style block was found after the first cue.");
                }
            }
        } catch (AnonymousClass6u7 e) {
            throw new AnonymousClass6OY((Throwable) e);
        }
    }
}
