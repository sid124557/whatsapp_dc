package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9oX  reason: invalid class name and case insensitive filesystem */
public class C203929oX extends C1908099x {
    public Object A00;
    public Object A01;
    public final int A02;

    public void A03(AnonymousClass34V r12) {
        AnonymousClass34V r5 = r12;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r12, 0);
                super.A03(r12);
                ((C196939bz) ((C203019mz) this.A00)).A00.BjL();
                return;
            case 1:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: IndiaUpiBlockListManager fetch error: ", r12);
                ((AnonymousClass9O9) this.A01).A01.BaJ(r12);
                return;
            case 2:
                super.A03(r12);
                ((C202569mE) this.A01).BLs(r12);
                return;
            case 3:
            case 6:
                super.A03(r12);
                ((C202489m6) this.A01).BZj(r12);
                return;
            case 4:
                super.A03(r12);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C193879Ql) this.A01).A00;
                if (r12 == null) {
                    indiaUpiSendPaymentActivity.A0V.A04(indiaUpiSendPaymentActivity.A00, 2);
                }
                indiaUpiSendPaymentActivity.A86(r12, true);
                return;
            case 5:
                super.A03(r12);
                ((AnonymousClass9RO) this.A01).A00(r5, (String) null, (String) null, (String) null, (String) null, (String) null);
                return;
            case 11:
                super.A03(r12);
                ((AnonymousClass9Qo) this.A01).A00((AnonymousClass39Q) null, (AnonymousClass39Q) null, r12);
                return;
            case 12:
                super.A03(r12);
                A06(r12);
                C203049n2 r1 = ((AnonymousClass9AL) this.A00).A01;
                if (r1 != null) {
                    r1.BVC(r12, (String) null);
                    return;
                }
                return;
            case 13:
                super.A03(r12);
                ((AnonymousClass9R9) this.A01).A00(r12, (String) null);
                return;
            case 14:
                super.A03(r12);
                AnonymousClass94u r0 = ((C193129Ng) this.A01).A00;
                if (r12 != null) {
                    C193639Pk.A00(r0.A00, 4);
                    return;
                } else {
                    r0.A0E();
                    return;
                }
            case 15:
                super.A03(r12);
                AnonymousClass9AF r4 = (AnonymousClass9AF) this.A00;
                C197109ca r2 = r4.A0B;
                C134246ig A03 = r2.A03(r12, 5);
                A03.A0O = "";
                r2.BKA(A03);
                C202629mK r02 = r4.A01;
                if (r02 != null) {
                    r02.BZf((C133686hm) null, r12);
                    return;
                }
                return;
            default:
                super.A03(r12);
                ((C202589mG) this.A01).BaJ(r12);
                return;
        }
    }

    public void A04(AnonymousClass34V r12) {
        AnonymousClass34V r5 = r12;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r12, 0);
                super.A04(r12);
                ((C196939bz) ((C203019mz) this.A00)).A00.BjL();
                return;
            case 1:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: IndiaUpiBlockListManager fetch error: ", r12);
                ((AnonymousClass9O9) this.A01).A01.BaJ(r12);
                return;
            case 2:
                super.A04(r12);
                ((C202569mE) this.A01).BLs(r12);
                return;
            case 3:
            case 6:
                super.A04(r12);
                ((C202489m6) this.A01).BZj(r12);
                return;
            case 4:
                super.A04(r12);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C193879Ql) this.A01).A00;
                if (r12 == null) {
                    indiaUpiSendPaymentActivity.A0V.A04(indiaUpiSendPaymentActivity.A00, 2);
                }
                indiaUpiSendPaymentActivity.A86(r12, true);
                return;
            case 5:
                super.A04(r12);
                ((AnonymousClass9RO) this.A01).A00(r5, (String) null, (String) null, (String) null, (String) null, (String) null);
                return;
            case 11:
                super.A04(r12);
                ((AnonymousClass9Qo) this.A01).A00((AnonymousClass39Q) null, (AnonymousClass39Q) null, r12);
                return;
            case 12:
                super.A04(r12);
                A06(r12);
                C203049n2 r1 = ((AnonymousClass9AL) this.A00).A01;
                if (r1 != null) {
                    r1.BVC(r12, (String) null);
                    return;
                }
                return;
            case 13:
                super.A04(r12);
                ((AnonymousClass9R9) this.A01).A00(r12, (String) null);
                return;
            case 14:
                super.A04(r12);
                AnonymousClass94u r0 = ((C193129Ng) this.A01).A00;
                if (r12 != null) {
                    C193639Pk.A00(r0.A00, 4);
                    return;
                } else {
                    r0.A0E();
                    return;
                }
            case 15:
                super.A04(r12);
                AnonymousClass9AF r4 = (AnonymousClass9AF) this.A00;
                C197109ca r2 = r4.A0B;
                C134246ig A03 = r2.A03(r12, 5);
                A03.A0O = "";
                r2.BKA(A03);
                C202629mK r02 = r4.A01;
                if (r02 != null) {
                    r02.BZf((C133686hm) null, r12);
                    return;
                }
                return;
            default:
                super.A04(r12);
                ((C202589mG) this.A01).BaJ(r12);
                return;
        }
    }

    public void A05(AnonymousClass36K r24) {
        String str;
        String str2;
        Bundle bundle;
        Bundle bundle2;
        String str3;
        String str4;
        ArrayList arrayList;
        AnonymousClass36K r3 = r24;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r3, 0);
                super.A05(r3);
                try {
                    C97204xo r4 = (C97204xo) this.A01;
                    ArrayList A04 = r4.A05.A04((C201629kS) null, r3);
                    if (A04 == null || A04.size() <= 0) {
                        ((C196939bz) ((C203019mz) this.A00)).A00.BjL();
                        return;
                    }
                    C29491iu r2 = new C29491iu();
                    r2.A01 = A04;
                    r4.A04.A02(r2);
                    Object obj = A04.get(0);
                    C196939bz r5 = (C196939bz) ((C203019mz) this.A00);
                    if (obj != null) {
                        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r5.A00;
                        indiaUpiCheckOrderDetailsActivity.A04.BkM(new C200319i8(new C195279Wy(obj, 1), indiaUpiCheckOrderDetailsActivity));
                    }
                    r5.A00.BjL();
                    return;
                } catch (AnonymousClass24Y unused) {
                    Log.e("PAY: IndiaUpiP2mGetOrderTransactionAction/getOrderTransaction: invalid response message");
                    new AnonymousClass34V();
                    ((C196939bz) ((C203019mz) this.A00)).A00.BjL();
                    return;
                }
            case 1:
                AnonymousClass36K A0T = C1899693i.A0T(r3);
                if (A0T != null) {
                    arrayList = AnonymousClass001.A0s();
                    AnonymousClass36K[] r52 = A0T.A03;
                    if (r52 != null) {
                        for (AnonymousClass36K A0L : r52) {
                            String A0L2 = AnonymousClass36K.A0L(A0L, "vpa");
                            if (!TextUtils.isEmpty(A0L2)) {
                                arrayList.add(A0L2);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                AnonymousClass9O9 r53 = (AnonymousClass9O9) this.A01;
                C194619Tt r42 = r53.A00;
                synchronized (r42) {
                    long A0H = r42.A03.A0H();
                    r42.A00 = A0H;
                    if (arrayList != null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("PAY: IndiaUpiBlockListManager fetch success size: ");
                        A0o.append(arrayList.size());
                        A0o.append(" time: ");
                        A0o.append(r42.A00);
                        C18280x3.A14(A0o);
                        Set set = r42.A0A;
                        set.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            set.add(new AnonymousClass9SS(C1899693i.A0G(AnonymousClass3QD.A00(), AnonymousClass001.A0m(it), "upiHandle"), r42));
                        }
                        C18270x1.A0j(C620933l.A00(r42.A09), "payments_block_list", TextUtils.join(";", arrayList));
                    } else {
                        C18260x0.A12("PAY: IndiaUpiBlockListManager fetch success hash matched time: ", AnonymousClass001.A0o(), A0H);
                    }
                    C18270x1.A0i(C620933l.A00(r42.A09), "payments_block_list_last_sync_time", r42.A00);
                }
                r53.A01.BaJ((AnonymousClass34V) null);
                return;
            case 2:
                super.A05(r3);
                ((C202569mE) this.A01).BLs((AnonymousClass34V) null);
                return;
            case 3:
            case 6:
                super.A05(r3);
                ((C202489m6) this.A01).BZj((AnonymousClass34V) null);
                return;
            case 4:
                super.A05(r3);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((C193879Ql) this.A01).A00;
                indiaUpiSendPaymentActivity.A0V.A04(indiaUpiSendPaymentActivity.A00, 2);
                indiaUpiSendPaymentActivity.A86((AnonymousClass34V) null, true);
                return;
            case 5:
                try {
                    AnonymousClass36K A0m = r3.A0m("account");
                    String A0q = A0m.A0q("mcc");
                    String A0q2 = A0m.A0q("receiver-vpa");
                    String A0r = A0m.A0r("payee-name", (String) null);
                    String A0r2 = A0m.A0r("purpose-code", (String) null);
                    AnonymousClass36K A0l = A0m.A0l("l2checkout");
                    if (A0l != null) {
                        str = A0l.A0r("merchant-public-key", (String) null);
                    } else {
                        str = null;
                    }
                    ((AnonymousClass9RO) this.A01).A00((AnonymousClass34V) null, A0q, A0q2, A0r, A0r2, str);
                    return;
                } catch (AnonymousClass24Y unused2) {
                    AnonymousClass9RO r0 = (AnonymousClass9RO) this.A01;
                    AnonymousClass34V A0M = C1899693i.A0M();
                    AnonymousClass9Ct r1 = r0.A01;
                    C202759mX r02 = r0.A00;
                    r1.BjL();
                    r02.BS6(A0M);
                    return;
                }
            case 11:
                super.A05(r3);
                AnonymousClass36K A0T2 = C1899693i.A0T(r3);
                if (A0T2 == null) {
                    Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
                } else {
                    AnonymousClass99E r6 = new AnonymousClass99E();
                    r6.A04(((AnonymousClass9AK) this.A00).A03, A0T2, 6);
                    Bundle bundle3 = r6.A00;
                    if (!((bundle3 != null && bundle3.getString("updatedVpaFor") != null) || (bundle = r6.A00) == null || !C1899693i.A0y(bundle.getString("valid")) || (bundle2 = r6.A00) == null || bundle2.getString("balance") == null)) {
                        Bundle bundle4 = r6.A00;
                        if (bundle4 != null) {
                            str3 = bundle4.getString("balance");
                        } else {
                            str3 = null;
                        }
                        int i = ((AnonymousClass3H6) AnonymousClass1S3.A05).A01;
                        AnonymousClass39Q A002 = AnonymousClass39Q.A00(str3, i);
                        Bundle bundle5 = r6.A00;
                        if (bundle5 != null) {
                            str4 = bundle5.getString("usableBalance");
                        } else {
                            str4 = null;
                        }
                        ((AnonymousClass9Qo) this.A01).A00(A002, AnonymousClass39Q.A00(str4, i), (AnonymousClass34V) null);
                        return;
                    }
                }
                ((AnonymousClass9Qo) this.A01).A00((AnonymousClass39Q) null, (AnonymousClass39Q) null, C1899693i.A0M());
                return;
            case 12:
                super.A05(r3);
                AnonymousClass36K A0T3 = C1899693i.A0T(r3);
                if (A0T3 == null) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: empty account node");
                    A06((AnonymousClass34V) null);
                    C203049n2 r12 = ((AnonymousClass9AL) this.A00).A01;
                    if (r12 != null) {
                        r12.BVC(C1899693i.A0M(), (String) null);
                        return;
                    }
                    return;
                }
                String A0r3 = A0T3.A0r("keys", (String) null);
                if (TextUtils.isEmpty(A0r3)) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: missing keys");
                    A06((AnonymousClass34V) null);
                    C203049n2 r13 = ((AnonymousClass9AL) this.A00).A01;
                    if (r13 != null) {
                        r13.BVC(C1899693i.A0M(), (String) null);
                        return;
                    }
                    return;
                }
                AnonymousClass9AL r32 = (AnonymousClass9AL) this.A00;
                r32.A05.A0I(A0r3);
                r32.A09.A07((Integer) this.A01, "upi-list-keys");
                C203049n2 r03 = r32.A01;
                if (r03 != null) {
                    r03.BVC((AnonymousClass34V) null, A0r3);
                    return;
                }
                return;
            case 13:
                super.A05(r3);
                AnonymousClass36K A0T4 = C1899693i.A0T(r3);
                if (A0T4 != null) {
                    ((AnonymousClass9R9) this.A01).A00((AnonymousClass34V) null, A0T4.A0r("signed-qr-code", (String) null));
                    return;
                }
                return;
            case 14:
                super.A05(r3);
                ((C193129Ng) this.A01).A00.A0E();
                return;
            case 15:
                super.A05(r3);
                AnonymousClass9AF r8 = (AnonymousClass9AF) this.A00;
                AnonymousClass9U4 r9 = r8.A0A;
                C202529mA BAY = AnonymousClass9U4.A07(r9).BAY();
                C626936e.A06(BAY);
                ArrayList BgU = BAY.BgU(r8.A04, r3);
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = BgU.iterator();
                C133766hu r19 = null;
                C133686hm r62 = null;
                while (it2.hasNext()) {
                    C133766hu r54 = (C133766hu) ((AnonymousClass38U) it2.next());
                    String str5 = (String) C1899593h.A0X(r54.A02);
                    C161357pU r122 = C161357pU.A0F;
                    String str6 = r54.A06;
                    int A022 = C18310x6.A02(r54.A08 ? 1 : 0);
                    int A023 = C18310x6.A02(r54.A07 ? 1 : 0);
                    byte[] bArr = r54.A09;
                    C133686hm r11 = new C133686hm(r122, A022, A023, -1, -1);
                    r11.A0A = str6;
                    r11.A0D(str5);
                    r11.A0B = (String) C1899593h.A0X(r54.A01);
                    r11.A0D = bArr;
                    r11.A08 = r54;
                    A0s.add(r11);
                    if ((str5 != null && str5.equals(C1899593h.A0X(r8.A00.A02))) || (r19 == null && (r54.A07 || r54.A08))) {
                        r62 = r11;
                        r19 = r54;
                    }
                }
                C197109ca r43 = r8.A0B;
                C134246ig A03 = r43.A03((AnonymousClass34V) null, 5);
                if (r62 != null) {
                    C133796hx r22 = r62.A08;
                    if (r22 instanceof AnonymousClass99H) {
                        str2 = ((AnonymousClass99H) r22).A0C;
                        A03.A0O = str2;
                        r43.BKA(A03);
                        AnonymousClass9U4.A00(r9).A05(new C195209Wo(this.A01, r19, this, r62, 0), A0s);
                        return;
                    }
                }
                str2 = "";
                A03.A0O = str2;
                r43.BKA(A03);
                AnonymousClass9U4.A00(r9).A05(new C195209Wo(this.A01, r19, this, r62, 0), A0s);
                return;
            default:
                super.A05(r3);
                ((C202589mG) this.A01).BaJ((AnonymousClass34V) null);
                return;
        }
    }

    public final void A06(AnonymousClass34V r4) {
        ((AnonymousClass9AL) this.A00).A09.A05(r4, (Integer) this.A01, "upi-list-keys");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9A6 r12, C193129Ng r13) {
        super(context, r9, r10, r11, "upi-verify-qr-code");
        this.A02 = 14;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9A6 r12, AnonymousClass9R9 r13) {
        super(context, r9, r10, r11, "upi-sign-qr-code");
        this.A02 = 13;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9AB r12, AnonymousClass9RO r13) {
        super(context, r9, r10, r11, "upi-get-p2m-config");
        this.A02 = 5;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r13, C40602Ha r14, C153607bd r15, AnonymousClass9AF r16, C197109ca r17, C202709mS r18, AnonymousClass9B3 r19, String str) {
        super(context, r13, r14, r15, r17, r19, "upi-register-vpa", str, 5);
        this.A02 = 15;
        this.A00 = r16;
        this.A01 = r18;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9AK r12, AnonymousClass9Qo r13) {
        super(context, r9, r10, r11, "upi-check-balance");
        this.A02 = 11;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r11, C40602Ha r12, C153607bd r13, AnonymousClass9AL r14, C197109ca r15, Integer num) {
        super(context, r11, r12, r13, r15, "upi-list-keys", 1);
        this.A02 = 12;
        this.A00 = r14;
        this.A01 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9AN r12, C193879Ql r13) {
        super(context, r9, r10, r11, "upi-collect-from-vpa");
        this.A02 = 4;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r11, C40602Ha r12, C153607bd r13, C202569mE r14, AnonymousClass9AN r15, C197109ca r16) {
        super(context, r11, r12, r13, r16, "upi-accept-collect", 31);
        this.A02 = 2;
        this.A00 = r15;
        this.A01 = r14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C203929oX(android.content.Context r7, X.C69263Wi r8, X.C40602Ha r9, X.C153607bd r10, X.C202589mG r11, X.AnonymousClass9AO r12, int r13) {
        /*
            r6 = this;
            r0 = r6
            r6.A02 = r13
            switch(r13) {
                case 7: goto L_0x001a;
                case 8: goto L_0x0017;
                case 9: goto L_0x0014;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r5 = "upi-resume-mandate"
        L_0x0008:
            r6.A00 = r12
            r6.A01 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0014:
            java.lang.String r5 = "upi-pause-mandate"
            goto L_0x0008
        L_0x0017:
            java.lang.String r5 = "upi-revoke-mandate"
            goto L_0x0008
        L_0x001a:
            java.lang.String r5 = "upi-accept-mandate-request"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203929oX.<init>(android.content.Context, X.3Wi, X.2Ha, X.7bd, X.9mG, X.9AO, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, C203019mz r12, C97204xo r13) {
        super(context, r9, r10, r11, "get-order-transaction");
        this.A02 = 0;
        this.A00 = r12;
        this.A01 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, AnonymousClass9O9 r10, C40602Ha r11, C153607bd r12, AnonymousClass9A7 r13) {
        super(context, r9, r11, r12, "upi-get-blocked-vpas");
        this.A02 = 1;
        this.A00 = r13;
        this.A01 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C202489m6 r10, C40602Ha r11, C153607bd r12, AnonymousClass9AN r13) {
        super(context, r9, r11, r12, "upi-reject-collect");
        this.A02 = 3;
        this.A00 = r13;
        this.A01 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203929oX(Context context, C69263Wi r9, C202489m6 r10, C40602Ha r11, C153607bd r12, AnonymousClass9AO r13) {
        super(context, r9, r11, r12, "upi-reject-mandate-request");
        this.A02 = 6;
        this.A00 = r13;
        this.A01 = r10;
    }
}
