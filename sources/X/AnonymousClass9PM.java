package X;

/* renamed from: X.9PM  reason: invalid class name */
public final class AnonymousClass9PM {
    public C192389Jn A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass9PM(String str, String str2, String str3) {
        C192389Jn r0;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        int parseInt = Integer.parseInt(str);
        if (parseInt == 0) {
            r0 = C192389Jn.PAYLOAD_FORMAT_INDICATOR;
        } else if (parseInt == 1) {
            r0 = C192389Jn.POINT_OF_INFORMATION_METHOD;
        } else {
            if (2 <= parseInt) {
                if (parseInt < 4) {
                    r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_VISA;
                } else if (parseInt < 6) {
                    r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_MASTERCARD;
                } else {
                    if (parseInt >= 9) {
                        if (parseInt < 11) {
                            r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_DISCOVER;
                        } else if (parseInt < 13) {
                            r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_AMEX;
                        } else if (parseInt < 15) {
                            r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_JCB;
                        } else if (parseInt < 17) {
                            r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_UNION_PAY;
                        } else if (parseInt >= 26) {
                            if (parseInt < 52) {
                                r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_TEMPLATE;
                            } else if (parseInt == 52) {
                                r0 = C192389Jn.MERCHANT_CATEGORY_CODE;
                            } else if (parseInt == 53) {
                                r0 = C192389Jn.TRANSACTION_CURRENCY;
                            } else if (parseInt == 54) {
                                r0 = C192389Jn.TRANSACTION_AMOUNT;
                            } else if (parseInt == 58) {
                                r0 = C192389Jn.COUNTRY_CODE;
                            } else if (parseInt == 59) {
                                r0 = C192389Jn.MERCHANT_NAME;
                            } else if (parseInt == 60) {
                                r0 = C192389Jn.MERCHANT_CITY;
                            } else if (parseInt == 61) {
                                r0 = C192389Jn.POSTAL_CODE;
                            } else if (parseInt == 62) {
                                r0 = C192389Jn.ADDITIONAL_DATA_FIELD_TEMPLATE;
                            } else if (parseInt == 63) {
                                r0 = C192389Jn.CRC16;
                            } else if (80 <= parseInt && parseInt < 100) {
                                r0 = C192389Jn.UNRESERVED_TEMPLATES;
                            }
                        }
                    }
                    r0 = C192389Jn.MERCHANT_ACCOUNT_INFORMATION_RESERVED_BY_EMV_CO;
                }
            }
            r0 = C192389Jn.UNKNOWN;
        }
        this.A00 = r0;
    }
}
