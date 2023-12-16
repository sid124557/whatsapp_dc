package X;

/* renamed from: X.3RW  reason: invalid class name */
public final class AnonymousClass3RW implements C85074Ev {
    public static final AnonymousClass3RY A01 = new AnonymousClass3RY(C18290x4.A0a(), "no_listener_available", (String) null, true, false);
    public final Integer A00 = C18290x4.A0b();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3RW) && C162457s7.A0P(this.A00, ((AnonymousClass3RW) obj).A00));
    }

    public String B6m() {
        return "We could not use zero-tap as you opted-out. Please opt in to zero-tap in WA";
    }

    public String B8w() {
        return "zero_tap_opt_out";
    }

    public boolean BCk() {
        return true;
    }

    public boolean BCy() {
        return false;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A00, -178602208) + 1231) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OtpZeroTapIneligibility(key=");
        A0o.append("zero_tap_opt_out");
        A0o.append(", debugMessage=");
        A0o.append("We could not use zero-tap as you opted-out. Please opt in to zero-tap in WA");
        A0o.append(", fallbackReason=");
        A0o.append(this.A00);
        A0o.append(", sendOnlyInEmulator=");
        A0o.append(true);
        A0o.append(", shouldSendToThirdPartyApp=");
        return C18260x0.A0A(A0o, false);
    }
}
