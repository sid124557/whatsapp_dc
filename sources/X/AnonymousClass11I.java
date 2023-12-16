package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.11I  reason: invalid class name */
public class AnonymousClass11I extends C05550Ty {
    public AnonymousClass4FW A00;
    public AnonymousClass4DI A01;
    public final C06270Wx A02;
    public final AnonymousClass08M A03;
    public final C56422rx A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final C29431io A07;
    public final AnonymousClass1VX A08;
    public final UserJid A09;
    public final C29271iY A0A;
    public final AnonymousClass9U4 A0B;
    public final C46782cC A0C;
    public final AnonymousClass34W A0D = new AnonymousClass34W((AnonymousClass9WE) null, (C378924l) null, 1);
    public final C195219Wq A0E;
    public final AnonymousClass2z0 A0F;
    public final AnonymousClass4FS A0G;
    public final boolean A0H;

    public AnonymousClass11I(C56422rx r4, C620633i r5, C56612sH r6, C29431io r7, AnonymousClass1VX r8, UserJid userJid, C29271iY r10, AnonymousClass9U4 r11, C46782cC r12, C195219Wq r13, AnonymousClass2z0 r14, AnonymousClass4FS r15, boolean z, boolean z2) {
        this.A08 = r8;
        this.A0G = r15;
        this.A07 = r7;
        this.A04 = r4;
        this.A0A = r10;
        this.A0C = r12;
        this.A09 = userJid;
        this.A0F = r14;
        this.A0H = z;
        this.A0E = r13;
        this.A0B = r11;
        this.A06 = r6;
        this.A05 = r5;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A02 = A012;
        if (!z2) {
            C86164Jb r0 = new C86164Jb(this, 7);
            this.A00 = r0;
            r7.A06(r0);
            C67903Rc r02 = new C67903Rc(this);
            this.A01 = r02;
            r10.A06(r02);
        }
    }

    public static final String A01(Context context, AnonymousClass39I r5, String str, String str2) {
        C162457s7.A0J(context, 0);
        if (r5.A02.ordinal() == 1) {
            return C18300x5.A0e(context, str, C18310x6.A1b(str2, 0), 1, r5.A00);
        }
        String string = context.getString(r5.A00);
        C162457s7.A0H(string);
        return string;
    }

    public AnonymousClass39S A0D(AnonymousClass4DV r5, String str, int i) {
        String str2;
        C162457s7.A0J(r5, 2);
        long A082 = C18290x4.A08();
        if (i == 2) {
            str2 = "payment_instruction";
        } else if (i == 3) {
            str2 = "confirm";
        } else if (i != 6) {
            Log.e(C160757oG.A01("PaymentCheckoutOrderViewModel", "sendOrderNFM: invalid payment method was selected"));
            str2 = "";
        } else {
            str2 = "pix";
        }
        AnonymousClass39S A002 = A00(r5, str, str2, A082);
        this.A0C.A00(A002, r5);
        return A002;
    }

    public final void A0H(C95814uZ r13, AnonymousClass39S r14, AnonymousClass4DV r15) {
        boolean A1Y = AnonymousClass0x2.A1Y(r13, r15);
        C621033m r2 = this.A0C.A00;
        C624134x r152 = (C624134x) r15;
        String str = null;
        try {
            str = AnonymousClass35U.A05(r14, false).toString();
        } catch (JSONException unused) {
            Log.e("UserActions/userActionSendOrderUpdateMessage failed to build parameter json for order status message");
        }
        AnonymousClass39A r7 = null;
        Log.d("UserActions/userActionSendOrderMessages");
        AnonymousClass39P r8 = new AnonymousClass39P(Collections.singletonList(new AnonymousClass395(new AnonymousClass398("payment_method", str), false)));
        AnonymousClass39A r5 = new AnonymousClass39A((String) null, (byte[]) null, (String) null);
        C30791n7 r3 = new C30791n7(r2.A1X.A04(r13, A1Y), (byte) 55, r2.A0V.A0H());
        if (!TextUtils.isEmpty((CharSequence) null) || !TextUtils.isEmpty((CharSequence) null) || r5.A02 != null) {
            r7 = r5;
        }
        r3.Blz(new AnonymousClass39W(r7, r8, "", (String) null, ""));
        if (r152 != null) {
            r2.A1a.A00(r3, r152);
        }
        r2.A0O(r3);
        r2.A0l.A0V(r3);
    }

    public final void A0I(boolean z) {
        this.A03.A0G(this.A0D.A00((C624034w) null, this.A09, (AnonymousClass39I) null, (AnonymousClass213) null, (C30791n7) null, Boolean.valueOf(this.A0H), (List) null));
        this.A0G.BkP(new C71363bz(this, z));
    }

    public void A0C() {
        AnonymousClass4FW r1 = this.A00;
        if (r1 != null) {
            this.A07.A07(r1);
        }
        AnonymousClass4DI r12 = this.A01;
        if (r12 != null) {
            this.A0A.A07(r12);
        }
    }

    public final void A0F(C624034w r5) {
        C30791n7 r2;
        String str;
        String str2;
        AnonymousClass39S r0;
        String str3 = null;
        C60952zR r02 = (C60952zR) this.A0D.A00.A01;
        if (r02 != null && (r2 = r02.A04) != null && (str = r5.A0K) != null) {
            C624034w r03 = r2.A0P;
            if (r03 != null) {
                str2 = r03.A0K;
            } else {
                str2 = null;
            }
            if (!C162457s7.A0P(str2, str)) {
                AnonymousClass39W r04 = r2.A00;
                if (!(r04 == null || (r0 = r04.A01) == null)) {
                    str3 = r0.A04;
                }
                if (!C162457s7.A0P(str3, r5.A0K)) {
                    return;
                }
            }
            A0G(r5, r2);
        }
    }

    public final void A0G(C624034w r17, C30791n7 r18) {
        AnonymousClass9WE A002;
        AnonymousClass34W r6 = this.A0D;
        C30791n7 r13 = r18;
        if (r18 == null) {
            AnonymousClass212 r4 = AnonymousClass212.ORDER_NOT_FOUND;
            int A022 = C18320x8.A02(r4, 0);
            int i = R.string.f11nameremoved;
            int i2 = R.string.f11nameremoved;
            if (A022 != 1) {
                i = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
            }
            A002 = r6.A00((C624034w) null, (UserJid) null, new AnonymousClass39I(r4, i, i2), (AnonymousClass213) null, (C30791n7) null, (Boolean) null, (List) null);
        } else {
            A002 = r6.A00(r17, (UserJid) null, (AnonymousClass39I) null, (AnonymousClass213) null, r13, (Boolean) null, (List) null);
        }
        this.A03.A0G(A002);
    }

    public static final AnonymousClass39S A00(AnonymousClass4DV r25, String str, String str2, long j) {
        AnonymousClass39W B5s = r25.B5s();
        C626936e.A06(B5s);
        AnonymousClass39S r0 = B5s.A01;
        C626936e.A06(r0);
        AnonymousClass39H r4 = r0.A07;
        C162457s7.A0C(r4);
        String str3 = r0.A0E;
        return new AnonymousClass39S((C85204Fi) null, (AnonymousClass39L) null, r4, r0.A08, (AnonymousClass39G) null, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, str, str2, (String) null, (List) null, (List) null, (List) null, r0.A0J, (byte[]) null, j, true, false);
    }

    public final void A0E(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("save_order_detail_state_key");
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("should_show_shimmer_key");
            Parcelable parcelable = bundle2.getParcelable("merchant_jid_key");
            Serializable serializable = bundle2.getSerializable("merchant_status_key");
            this.A0G.BkP(new C70923bH(this, parcelable, bundle2.getSerializable("checkout_error_code_key"), bundle2.getParcelable("payment_transaction_key"), serializable, bundle2.getParcelableArrayList("installment_option_key"), 1, z));
        }
    }
}
