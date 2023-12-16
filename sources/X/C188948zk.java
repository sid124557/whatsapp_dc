package X;

/* renamed from: X.8zk  reason: invalid class name and case insensitive filesystem */
public class C188948zk extends C142756xi {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C188948zk(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0010;
                case 2: goto L_0x0014;
                case 3: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "EXACT_GROUPING"
            r0 = 4
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "POSSIBLE"
            r0 = 0
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "VALID"
            r0 = 1
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "WHATS_APP"
            r0 = 2
            goto L_0x0008
        L_0x0018:
            java.lang.String r1 = "STRICT_GROUPING"
            r0 = 3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188948zk.<init>(int):void");
    }

    public boolean A00(C162167rN r6, AnonymousClass8LC r7, String str) {
        C172308Km A0E;
        C172298Kl A0C;
        if (1 - this.A00 != 0) {
            C142756xi r2 = C142756xi.A03;
            if (r2.A00(r6, r7, str)) {
                return true;
            }
            if (r7.hasNationalNumber) {
                String valueOf = String.valueOf(r7.nationalNumber_);
                if (valueOf.startsWith("8") && r7.hasCountryCode && r7.countryCode_ == 7 && r7.hasCountryCodeSource && r7.countryCodeSource_ == C141706w0.FROM_DEFAULT_COUNTRY) {
                    long parseLong = Long.parseLong(valueOf.substring(1));
                    r7.hasNationalNumber = true;
                    r7.nationalNumber_ = parseLong;
                    C141706w0 r0 = C141706w0.FROM_NUMBER_WITHOUT_PLUS_SIGN;
                    r7.hasCountryCodeSource = true;
                    r7.countryCodeSource_ = r0;
                    return r2.A00(r6, r7, str);
                }
            }
            if (!r7.hasItalianLeadingZero || !r7.italianLeadingZero_) {
                return false;
            }
            r7.hasItalianLeadingZero = false;
            r7.italianLeadingZero_ = false;
            return r2.A00(r6, r7, str);
        } else if (!r6.A0M(r7)) {
            return false;
        } else {
            int i = 0;
            while (i < str.length() - 1) {
                char charAt = str.charAt(i);
                if (charAt == 'x' || charAt == 'X') {
                    int i2 = i + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == 'x' || charAt2 == 'X') {
                        if (r6.A0A(r7, str.substring(i2)) != C140886ug.NSN_MATCH) {
                            return false;
                        }
                        i = i2;
                    } else if (!C162167rN.A03(str.substring(i)).equals(r7.extension_)) {
                        return false;
                    }
                }
                i++;
            }
            if (r7.countryCodeSource_ != C141706w0.FROM_DEFAULT_COUNTRY || (A0E = r6.A0E(r6.A0G(r7.countryCode_))) == null || (A0C = r6.A0C(C162167rN.A01(r7), A0E.numberFormat_)) == null) {
                return true;
            }
            String str2 = A0C.nationalPrefixFormattingRule_;
            if (str2.length() <= 0 || A0C.nationalPrefixOptionalWhenFormatting_ || C162167rN.A03(AnonymousClass0x7.A0r(str2, str2.indexOf("$1"))).length() == 0) {
                return true;
            }
            return r6.A0K(A0E, C18330xA.A0A(C162167rN.A03(r7.rawInput_)), (StringBuilder) null);
        }
    }
}
