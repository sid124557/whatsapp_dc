package X;

/* renamed from: X.3RX  reason: invalid class name */
public final class AnonymousClass3RX implements C85074Ev {
    public static final AnonymousClass3RX A02 = new AnonymousClass3RX("whatsapp_message_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications in the WhatsApp settings. Please un-mute the chat in the chat screen");
    public static final AnonymousClass3RX A03 = new AnonymousClass3RX("whatsapp_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications. Please turn it on in device settings");
    public static final AnonymousClass3RX A04 = new AnonymousClass3RX("zero_tap_unavailable", "Zero-tap is not yet available in this version of WhatsApp. Message will be delivered one-tap. Please update to the newest version of WhatsApp to test zero-tap");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3RX) {
                AnonymousClass3RX r5 = (AnonymousClass3RX) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C18310x6.A09(this.A01) + C18270x1.A00(this.A00)) * 31 * 31) + 1231) * 31) + 1231;
    }

    public AnonymousClass3RX(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String B6m() {
        return this.A00;
    }

    public String B8w() {
        return this.A01;
    }

    public boolean BCk() {
        return true;
    }

    public boolean BCy() {
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OtpEligibilityWarning(key=");
        A0o.append(this.A01);
        A0o.append(", debugMessage=");
        A0o.append(this.A00);
        A0o.append(", fallbackReason=");
        A0o.append((Object) null);
        A0o.append(", sendOnlyInEmulator=");
        A0o.append(true);
        A0o.append(", shouldSendToThirdPartyApp=");
        return C18260x0.A0A(A0o, true);
    }
}
