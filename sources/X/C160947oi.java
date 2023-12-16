package X;

import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.7oi  reason: invalid class name and case insensitive filesystem */
public final class C160947oi {
    public static String A02(CharSequence... charSequenceArr) {
        CharSequence charSequence;
        int length = charSequenceArr.length;
        if (length != 0) {
            int i = 0;
            if (length == 1) {
                charSequence = charSequenceArr[0];
            } else {
                int i2 = 0;
                int i3 = 0;
                int i4 = -1;
                do {
                    int length2 = charSequenceArr[i2].length();
                    i3 += length2;
                    if (i4 != -2 && length2 > 0) {
                        int i5 = i4;
                        i4 = -2;
                        if (i5 == -1) {
                            i4 = i2;
                        }
                    }
                    i2++;
                } while (i2 < length);
                if (i3 != 0) {
                    if (i4 > 0) {
                        charSequence = charSequenceArr[i4];
                    } else {
                        StringBuilder A0Y = AnonymousClass6CA.A0Y(i3);
                        do {
                            A0Y.append(charSequenceArr[i]);
                            i++;
                        } while (i < length);
                        return A0Y.toString();
                    }
                }
            }
            return charSequence.toString();
        }
        return "";
    }

    public static String A01(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringWriter stringWriter = new StringWriter(length);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z2) {
                A0Y.append(charAt);
                if (A0Y.length() == 4) {
                    try {
                        stringWriter.write((char) Integer.parseInt(A0Y.toString(), 16));
                        A0Y.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        throw new C173678Re(AnonymousClass000.A0P(A0Y, "Unable to parse unicode value: ", AnonymousClass001.A0o()), e);
                    }
                }
            } else if (z) {
                int i2 = 34;
                if (charAt != '\"') {
                    i2 = 39;
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            i2 = 8;
                            if (charAt != 'b') {
                                i2 = 12;
                                if (charAt != 'f') {
                                    i2 = 10;
                                    if (charAt != 'n') {
                                        i2 = 13;
                                        if (charAt != 'r') {
                                            i2 = 9;
                                            if (charAt != 't') {
                                                if (charAt != 'u') {
                                                    stringWriter.write(charAt);
                                                } else {
                                                    z = false;
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            stringWriter.write(92);
                        }
                        z = false;
                    }
                }
                stringWriter.write(i2);
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                stringWriter.write(charAt);
            }
        }
        if (z) {
            stringWriter.write(92);
        }
        return stringWriter.toString();
    }

    public static void A03(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass001.A0c(str);
        }
    }

    public static String A00(Iterable iterable, String str, String str2) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        while (true) {
            A0o.append(str2);
            A0o.append(it.next());
            A0o.append(str2);
            if (!it.hasNext()) {
                return A0o.toString();
            }
            A0o.append(str);
        }
    }
}
