package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5ZP  reason: invalid class name */
public class AnonymousClass5ZP {
    public static final HashSet A0J = C18280x3.A0h(new String[]{"7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"});
    public static final HashSet A0K = C18280x3.A0h(new String[]{"BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER"});
    public static final HashSet A0L = C18280x3.A0h(new String[]{"DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"});
    public static final HashSet A0M = C18280x3.A0h(new String[]{"INLINE", "URL", "CONTENT-ID", "CID"});
    public static final Pattern A0N = Pattern.compile("type=(.*?)[:;]");
    public static final Pattern A0O = Pattern.compile("waid=(.*?)[:;]");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public String A0C = null;
    public String A0D;
    public String A0E;
    public HashSet A0F = AnonymousClass002.A0K();
    public AnonymousClass5QS A0G = null;
    public C183668qQ A0H;
    public boolean A0I = false;

    public String A01() {
        if (!(this instanceof C1222763t)) {
            return this.A0H.readLine();
        }
        C1222763t r2 = (C1222763t) this;
        String str = r2.A00;
        if (str == null) {
            return r2.A0H.readLine();
        }
        r2.A00 = null;
        return str;
    }

    public String A02() {
        StringBuilder sb;
        if (this instanceof C1222763t) {
            C1222763t r5 = (C1222763t) this;
            if (r5.A0I) {
                r5.A0I = false;
                return r5.A0D;
            }
            loop0:
            while (true) {
                sb = null;
                while (true) {
                    String readLine = r5.A0H.readLine();
                    if (readLine != null) {
                        int length = readLine.length();
                        if (length == 0 || length > 16384) {
                            if (sb != null) {
                                break loop0;
                            }
                            String str = r5.A00;
                            if (str != null) {
                                r5.A00 = null;
                                return str;
                            }
                        } else if (readLine.charAt(0) != ' ' && readLine.charAt(0) != 9) {
                            String str2 = r5.A00;
                            r5.A00 = readLine;
                            if (str2 != null) {
                                return str2;
                            }
                            if (sb != null) {
                                break loop0;
                            }
                        } else if (sb != null) {
                            sb.append(readLine.substring(1));
                            if (sb.length() > 16384) {
                                break;
                            }
                        } else {
                            String str3 = r5.A00;
                            if (str3 != null) {
                                sb = AnonymousClass000.A0l(str3);
                                r5.A00 = null;
                                sb.append(readLine.substring(1));
                                if (sb.length() > 16384) {
                                    break;
                                }
                            } else {
                                throw new C143696zK("Space exists at the beginning of the line");
                            }
                        }
                    } else if (sb == null) {
                        String str4 = r5.A00;
                        if (str4 != null) {
                            r5.A00 = null;
                            return str4;
                        }
                        throw new C143696zK("Reached end of buffer.");
                    }
                }
            }
            return sb.toString();
        } else if (this.A0I) {
            this.A0I = false;
            return this.A0D;
        } else {
            String A012 = A01();
            if (A012 == null) {
                throw new C143696zK("Reached end of buffer.");
            } else if (A012.length() >= 16384 || A012.trim().length() <= 0) {
                return A02();
            } else {
                return A012;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "."
            int r0 = r8.indexOf(r0)
            r5 = 1
            int r4 = r0 + 1
            r6 = 0
            if (r4 <= 0) goto L_0x0014
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0015
            java.lang.String r3 = r7.A0D
            if (r3 != 0) goto L_0x0029
        L_0x0014:
            return r6
        L_0x0015:
            java.lang.String r3 = r7.A02()
            r7.A0D = r3
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r7.A0I = r5
        L_0x0029:
            int r0 = r3.length()
            if (r0 <= r4) goto L_0x0014
            r2 = 0
            java.lang.String r1 = r8.substring(r2, r4)
            java.lang.String r0 = r3.substring(r2, r4)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            if (r9 == 0) goto L_0x0061
            int r0 = r4 + -1
            char r1 = r3.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x004b
            r5 = 0
        L_0x004b:
            X.C626936e.A0C(r5)
            java.lang.String r0 = ":"
            int r0 = r3.lastIndexOf(r0)
            if (r0 < r4) goto L_0x0014
            java.lang.String r0 = r3.substring(r4, r0)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0061
            return r6
        L_0x0061:
            r7.A0I = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZP.A04(java.lang.String, java.lang.String):java.lang.String");
    }

    public void A05(String str) {
        String str2;
        AnonymousClass5QS r0;
        boolean contains;
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String trim = split[0].trim();
            str2 = split[1].trim();
            if (!trim.equalsIgnoreCase(CredentialProviderBaseController.TYPE_TAG)) {
                if (trim.equals("VALUE")) {
                    if (A0M.contains(C86664Kz.A1L(str2)) || str2.startsWith("X-")) {
                        r0 = this.A0G;
                        if (r0 != null) {
                            r0.A01 = "VALUE";
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Unknown value \"");
                        A0o.append(str2);
                        throw new C143696zK(AnonymousClass000.A0X("\"", A0o));
                    }
                } else if (trim.equals("ENCODING")) {
                    if (this instanceof C1222763t) {
                        contains = C1222763t.A01.contains(C86664Kz.A1L(str2));
                    } else {
                        contains = A0J.contains(C86664Kz.A1L(str2));
                    }
                    if (contains || str2.startsWith("X-")) {
                        AnonymousClass5QS r02 = this.A0G;
                        if (r02 != null) {
                            r02.A01 = "ENCODING";
                            r02.A00(str2);
                        }
                        this.A0C = str2;
                        return;
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Unknown encoding \"");
                    A0o2.append(str2);
                    throw new C143696zK(AnonymousClass000.A0X("\"", A0o2));
                } else if (trim.equals("CHARSET")) {
                    r0 = this.A0G;
                    if (r0 != null) {
                        r0.A01 = "CHARSET";
                    } else {
                        return;
                    }
                } else if (trim.equals("LANGUAGE")) {
                    String[] split2 = str2.split("-");
                    int length = split2.length;
                    if (length <= 2) {
                        int i = 0;
                        String str3 = split2[0];
                        int length2 = str3.length();
                        int i2 = 0;
                        while (i2 < length2) {
                            char charAt = str3.charAt(i2);
                            if (charAt >= 'a') {
                                if (charAt <= 'z') {
                                    i2++;
                                }
                            } else if (charAt >= 'A' && charAt <= 'Z') {
                                i2++;
                            }
                            throw new C143696zK(C18260x0.A06("Invalid Language: \"", str2, "\""));
                        }
                        if (length > 1) {
                            String str4 = split2[1];
                            int length3 = str4.length();
                            while (i < length3) {
                                char charAt2 = str4.charAt(i);
                                if (charAt2 >= 'a') {
                                    if (charAt2 <= 'z') {
                                        i++;
                                    }
                                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                    i++;
                                }
                                throw new C143696zK(C18260x0.A06("Invalid Language: \"", str2, "\""));
                            }
                        }
                        r0 = this.A0G;
                        if (r0 != null) {
                            r0.A01 = "LANGUAGE";
                        } else {
                            return;
                        }
                    } else {
                        throw new C143696zK(C18260x0.A06("Invalid Language: \"", str2, "\""));
                    }
                } else if (trim.startsWith("X-")) {
                    r0 = this.A0G;
                    if (r0 != null) {
                        r0.A01 = trim;
                    } else {
                        return;
                    }
                } else if (trim.equalsIgnoreCase("WAID")) {
                    AnonymousClass5QS r1 = this.A0G;
                    if (r1 != null) {
                        r1.A01 = "waId";
                        r1.A00(str2);
                        return;
                    }
                    return;
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("Unknown type \"");
                    A0o3.append(trim);
                    throw new C143696zK(AnonymousClass000.A0X("\"", A0o3));
                }
                r0.A00(str2);
                return;
            }
        } else {
            str2 = split[0];
        }
        A06(str2);
    }

    public void A06(String str) {
        AnonymousClass5QS r2;
        String replaceAll;
        if (this instanceof C1222763t) {
            String[] A1b = C18320x8.A1b(str);
            this.A0G.A01 = CredentialProviderBaseController.TYPE_TAG;
            for (String str2 : A1b) {
                if (str2.length() < 2 || !str2.startsWith("\"") || !str2.endsWith("\"")) {
                    r2 = this.A0G;
                    replaceAll = str2.replaceAll("[_$!<|>!$_]", "");
                } else {
                    r2 = this.A0G;
                    replaceAll = str2.substring(1, str2.length() - 1);
                }
                r2.A00(replaceAll);
            }
            return;
        }
        if (!A0L.contains(str) && !str.startsWith("X-")) {
            HashSet hashSet = this.A0F;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                C18260x0.A0t("Type unsupported by vCard 2.1: ", str, AnonymousClass001.A0o());
            }
        }
        AnonymousClass5QS r1 = this.A0G;
        if (r1 != null) {
            r1.A01 = CredentialProviderBaseController.TYPE_TAG;
            r1.A00(str);
        }
    }

    public static String A00(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("matcher should have found ");
        A0o.append(pattern.pattern());
        C18260x0.A0q(" entry in vCard for line: ", str, A0o);
        return null;
    }

    public String A03(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(str.substring(0, (str.length() - 1) + 1));
        while (true) {
            A0o.append("\r\n");
            String A012 = A01();
            if (A012 == null) {
                throw new C143696zK("File ended during parsing quoted-printable String");
            } else if (!A012.trim().endsWith("=")) {
                return AnonymousClass000.A0X(A012, A0o);
            } else {
                A0o.append(A012.substring(0, (A012.length() - 1) + 1));
            }
        }
    }
}
