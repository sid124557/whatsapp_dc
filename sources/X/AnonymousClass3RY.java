package X;

/* renamed from: X.3RY  reason: invalid class name */
public final class AnonymousClass3RY implements C85074Ev {
    public static final AnonymousClass3RY A05 = new AnonymousClass3RY(AnonymousClass0x7.A0h(), "ambiguous_delivery_destination", "There are multiple active OTP requests for the packages specified by this template, and we could not determine which package to deliver the code to.", true, true);
    public static final AnonymousClass3RY A06;
    public static final AnonymousClass3RY A07 = new AnonymousClass3RY(C18280x3.A0S(), "incorrect_signature_hash", "The signature hash of the installed app is %s, which does not match the signature hash declared in the one-tap template. Please update the template to reflect the correct signature hash", true, true);
    public static final AnonymousClass3RY A08 = new AnonymousClass3RY(0, "missing_handshake_or_disorder", "We received an OTP message but were unable to use one-tap as we did not receive the first part of the handshake.", false, true);
    public static final AnonymousClass3RY A09;
    public static final AnonymousClass3RY A0A;
    public static final AnonymousClass3RY A0B = new AnonymousClass3RY(1, "otp_request_expired", "Too much time elapsed between the OTP_REQUESTED intent and actual WhatsApp message delivery.", false, true);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3RY) {
                AnonymousClass3RY r5 = (AnonymousClass3RY) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer A0b = C18290x4.A0b();
        A06 = new AnonymousClass3RY(A0b, "incompatible_os_version", "The current Android version is < 19. one-tap is not supported due to missing platform features.", true, true);
        A0A = new AnonymousClass3RY(A0b, "no_retriever_button", (String) null, true, false);
        A09 = new AnonymousClass3RY(A0b, "no_package_name", (String) null, true, false);
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A00, (C18310x6.A09(this.A02) + C18270x1.A00(this.A01)) * 31), this.A03), this.A04);
    }

    public AnonymousClass3RY(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public String B6m() {
        return this.A01;
    }

    public String B8w() {
        return this.A02;
    }

    public boolean BCk() {
        return this.A03;
    }

    public boolean BCy() {
        return this.A04;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OtpSecurityIneligibility(key=");
        A0o.append(this.A02);
        A0o.append(", debugMessage=");
        A0o.append(this.A01);
        A0o.append(", fallbackReason=");
        A0o.append(this.A00);
        A0o.append(", sendOnlyInEmulator=");
        A0o.append(this.A03);
        A0o.append(", shouldSendToThirdPartyApp=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
