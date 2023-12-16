package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5rz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117475rz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass5QB A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        Long l;
        AnonymousClass5QB r5 = this.A02;
        UserJid userJid = this.A03;
        String str = this.A07;
        int i = this.A00;
        Integer num = this.A05;
        Integer num2 = this.A06;
        Boolean bool = this.A04;
        String str2 = this.A08;
        int i2 = this.A01;
        C108985dt A022 = r5.A00.A02(userJid);
        if (A022 != null) {
            if (A022.A0X) {
                str = null;
            }
            int intValue = num2.intValue();
            C105145Tt r52 = r5.A01;
            Integer valueOf = Integer.valueOf(i);
            if (num != null) {
                l = C18280x3.A0U(num);
            } else {
                l = null;
            }
            Long A0m = AnonymousClass0x9.A0m(intValue);
            r52.A0A.BkM(new C117485s0(r52, userJid, bool, valueOf, Integer.valueOf(i2), l, A0m, str, str2));
            return;
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "CatalogCategoriesLogger/log Could not load business profile or log for ", userJid);
    }

    public /* synthetic */ C117475rz(AnonymousClass5QB r1, UserJid userJid, Boolean bool, Integer num, Integer num2, String str, String str2, int i, int i2) {
        this.A02 = r1;
        this.A03 = userJid;
        this.A07 = str;
        this.A00 = i;
        this.A05 = num;
        this.A06 = num2;
        this.A04 = bool;
        this.A08 = str2;
        this.A01 = i2;
    }
}
