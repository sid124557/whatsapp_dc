package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4zr  reason: invalid class name and case insensitive filesystem */
public class C98124zr extends C98174zw {
    public C97934zY A00;
    public boolean A01;
    public final C111095hX A02;
    public final C55682qk A03;
    public final C69263Wi A04;
    public final AnonymousClass5ZR A05;
    public final C48042eF A06;
    public final C105025Tg A07;
    public final C187958y5 A08;
    public final AnonymousClass4FS A09;

    public /* bridge */ /* synthetic */ CharSequence A04(AnonymousClass3ZH r5, C624134x r6) {
        AnonymousClass1nF r62 = (AnonymousClass1nF) r6;
        if (TextUtils.isEmpty(r62.A01)) {
            return "";
        }
        return C106795aB.A02(AnonymousClass4Qv.A00(r5, r62, this), C87044Mw.A01(this.A01.getPaint(), C107335b8.A01(getContext(), R.drawable.msg_status_doc), r62.A01));
    }

    public C98124zr(Context context, C111095hX r2, C55682qk r3, C69263Wi r4, C103445Mz r5, AnonymousClass5ZR r6, C48042eF r7, C105025Tg r8, C187958y5 r9, AnonymousClass4FS r10) {
        super(context, r5);
        A02();
        this.A07 = r8;
        this.A04 = r4;
        this.A03 = r3;
        this.A09 = r10;
        this.A02 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = r9;
    }

    /* renamed from: A09 */
    public void A07(AnonymousClass1nF r3, List list) {
        super.A07(r3, list);
        this.A00.setMessage(r3, list);
        AnonymousClass54E.A00(this.A00, r3, this, 24);
    }
}
