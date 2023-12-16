package X;

/* renamed from: X.237  reason: invalid class name */
public enum AnonymousClass237 implements C181358md {
    CELLULAR_UNKNOWN(0),
    WIFI_UNKNOWN(1),
    CELLULAR_EDGE(100),
    CELLULAR_IDEN(101),
    CELLULAR_UMTS(102),
    CELLULAR_EVDO(103),
    CELLULAR_GPRS(104),
    CELLULAR_HSDPA(105),
    CELLULAR_HSUPA(106),
    CELLULAR_HSPA(107),
    CELLULAR_CDMA(C627136h.A03),
    CELLULAR_1XRTT(109),
    CELLULAR_EHRPD(110),
    CELLULAR_LTE(111),
    CELLULAR_HSPAP(112);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass237(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
