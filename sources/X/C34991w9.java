package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1w9  reason: invalid class name and case insensitive filesystem */
public final class C34991w9 extends C41022Iq {
    public static final ArrayList A02 = C18260x0.A0C("MASTERCARD", "VISA");
    public final String A00;
    public final List A01;

    public C34991w9(AnonymousClass36K r11) {
        AnonymousClass36K.A0N(r11, "installment_option");
        C626836d.A0F(r11, String.class, "CREDIT_CARD", new String[]{"payment_method"});
        this.A00 = C626836d.A0A(r11, A02, new String[]{"card_network"});
        this.A01 = C626836d.A0B(r11, C86304Jp.A00(22), new String[]{"installments", "installment"}, 0, 50);
        this.A00 = r11;
    }
}
