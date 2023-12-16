package X;

/* renamed from: X.9KG  reason: invalid class name */
public enum AnonymousClass9KG implements AnonymousClass4B4 {
    PRIMARY_PAYMENT_METHOD("primary_payment_method"),
    PAYMENT_METHOD("payment_method"),
    ALL_PAYMENT_METHODS("all_payment_methods"),
    CONTACT("contact"),
    ORDER("order"),
    DEVICE("device"),
    ERROR_MAP("error_map"),
    CURRENCY_AMOUNT("currency_amount");
    
    public final String fieldName;

    /* access modifiers changed from: public */
    static {
        AnonymousClass9KG[] r1;
        A00 = new C73653fr(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass9KG(String str) {
        this.fieldName = str;
    }

    public String B7a() {
        return this.fieldName;
    }
}
