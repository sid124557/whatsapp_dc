package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.95G  reason: invalid class name */
public class AnonymousClass95G extends AnonymousClass0R6 implements C185858uM {
    public AnonymousClass9NM A00 = null;
    public List A01;
    public final int A02;
    public final Context A03;
    public final C620733j A04;
    public final C66543Lv A05;
    public final C202509m8 A06;
    public final C160757oG A07;
    public final C202159lT A08;
    public final C194459Sy A09;
    public final C195219Wq A0A;

    public int A0G() {
        return this.A01.size();
    }

    /* renamed from: A0K */
    public void BNd(AnonymousClass95M r3, int i) {
        r3.A00.setText(((PaymentTransactionHistoryActivity) this.A08).A0X.get(i).toString());
    }

    public int B62(int i) {
        return ((C201719kc) ((PaymentTransactionHistoryActivity) this.A08).A0X.get(i)).count;
    }

    public int B83() {
        return ((PaymentTransactionHistoryActivity) this.A08).A0X.size();
    }

    public long B84(int i) {
        return -((Calendar) ((PaymentTransactionHistoryActivity) this.A08).A0X.get(i)).getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009e, code lost:
        if (r0.A01(((X.C624034w) r12.A01.get(r14)).A05).equals(r0.A01(((X.C624034w) r12.A01.get(r8)).A05)) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a6, code lost:
        if (r8 == r12.A01.size()) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        r1.findViewById(com.whatsapp.R.id.divider).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b4, code lost:
        r11 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r12.A08).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        if (r11 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
        r0 = r12.A05.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c2, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c4, code lost:
        r10 = r0.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        r9 = r12.A0A;
        r4 = r9.A0T(r2);
        r8 = r12.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (X.C107155an.A05(r8, r10, r11, true) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d7, code lost:
        r7.A0K(((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A08).A0M, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e4, code lost:
        if (r12.A00 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        X.C204409pJ.A00(r1, r2, r12, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        if (X.C107155an.A05(r8, r4, r11, true) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        r0 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A08).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fa, code lost:
        r6.A0K(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fe, code lost:
        r4 = r9.A0R(r2);
        r0 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A08).A0M;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r13, int r14) {
        /*
            r12 = this;
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0010
            X.7oG r1 = r12.A07
            java.lang.String r0 = "Transaction items size zero even when binding"
            r1.A05(r0)
        L_0x000f:
            return
        L_0x0010:
            java.util.List r0 = r12.A01
            java.lang.Object r2 = r0.get(r14)
            X.34w r2 = (X.C624034w) r2
            X.C626936e.A06(r2)
            boolean r0 = r13 instanceof X.AnonymousClass95I
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r13.A0H
            com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow r0 = (com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow) r0
            r0.Axw(r2)
            return
        L_0x0027:
            X.95N r13 = (X.AnonymousClass95N) r13
            X.9G3 r1 = r13.A00
            com.whatsapp.TextEmojiLabel r6 = r1.A0D
            java.lang.String r8 = ""
            r6.setText(r8)
            android.content.Context r5 = r1.getContext()
            android.content.Context r4 = r1.getContext()
            r3 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            int r0 = X.AnonymousClass5Yj.A02(r4, r3, r0)
            X.AnonymousClass0x2.A0q(r5, r6, r0)
            com.whatsapp.TextEmojiLabel r7 = r1.A0C
            r7.setText(r8)
            com.whatsapp.TextEmojiLabel r5 = r1.A0B
            r5.setText(r8)
            r4 = 0
            r5.setVisibility(r4)
            android.view.View r0 = r1.A02
            r3 = 8
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.A09
            r0.setText(r8)
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r1.A0F
            r0.setVisibility(r3)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            X.C86604Kt.A1F(r1, r0, r4)
            r1.Axw(r2)
            int r8 = r14 + 1
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r8 >= r0) goto L_0x00a0
            java.util.List r0 = r12.A01
            java.lang.Object r3 = r0.get(r14)
            X.34w r3 = (X.C624034w) r3
            java.util.List r0 = r12.A01
            java.lang.Object r10 = r0.get(r8)
            X.34w r10 = (X.C624034w) r10
            X.9Sy r0 = r12.A09
            long r3 = r3.A05
            X.9kc r9 = r0.A01(r3)
            long r3 = r10.A05
            X.9kc r0 = r0.A01(r3)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a8
        L_0x00a0:
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r8 != r0) goto L_0x00b4
        L_0x00a8:
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 8
            r3.setVisibility(r0)
        L_0x00b4:
            X.9lT r0 = r12.A08
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r11 = r0.A0M
            if (r11 == 0) goto L_0x00e2
            X.3Lv r0 = r12.A05
            X.34x r0 = r0.A0E(r2)
            if (r0 == 0) goto L_0x010c
            java.lang.String r10 = r0.A13()
        L_0x00c8:
            X.9Wq r9 = r12.A0A
            java.lang.String r4 = r9.A0T(r2)
            X.33j r8 = r12.A04
            r3 = 1
            boolean r0 = X.C107155an.A05(r8, r10, r11, r3)
            if (r0 == 0) goto L_0x00ec
            X.95G r0 = r13.A01
            X.9lT r0 = r0.A08
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r0 = r0.A0M
            r7.A0K(r0, r10)
        L_0x00e2:
            X.9NM r0 = r12.A00
            if (r0 == 0) goto L_0x000f
            r0 = 19
            X.C204409pJ.A00(r1, r2, r12, r0)
            return
        L_0x00ec:
            boolean r0 = X.C107155an.A05(r8, r4, r11, r3)
            if (r0 == 0) goto L_0x00fe
            X.95G r0 = r13.A01
            X.9lT r0 = r0.A08
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r0 = r0.A0M
        L_0x00fa:
            r6.A0K(r0, r4)
            goto L_0x00e2
        L_0x00fe:
            java.lang.String r4 = r9.A0R(r2)
            X.95G r0 = r13.A01
            X.9lT r0 = r0.A08
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r0 = r0.A0M
            r6 = r5
            goto L_0x00fa
        L_0x010c:
            r10 = 0
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass95G.BNf(X.0Ua, int):void");
    }

    public /* bridge */ /* synthetic */ C05570Ua BQN(ViewGroup viewGroup) {
        boolean z = this instanceof C191179Dl;
        Context context = this.A03;
        LayoutInflater layoutInflater = C111095hX.A02(context).getLayoutInflater();
        if (z) {
            View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
            inflate.setClickable(false);
            C86604Kt.A0z(context, inflate, AnonymousClass5Yj.A01(context));
            return new AnonymousClass9Dk(inflate);
        }
        View inflate2 = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        inflate2.setClickable(false);
        C86604Kt.A0z(context, inflate2, AnonymousClass5Yj.A01(context));
        return new AnonymousClass95M(inflate2);
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 2000) {
            return new AnonymousClass95I(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        return new AnonymousClass95N(new AnonymousClass9G3(this.A03, this.A06, this.A02), this);
    }

    public int getItemViewType(int i) {
        C624034w r2 = (C624034w) this.A01.get(i);
        if (r2.A03 != 1000 || !r2.A0P) {
            return 1000;
        }
        return 2000;
    }

    public AnonymousClass95G(Context context, C620733j r3, C66543Lv r4, C202509m8 r5, C160757oG r6, C202159lT r7, C194459Sy r8, C195219Wq r9, List list, int i) {
        this.A03 = context;
        this.A01 = AnonymousClass002.A0J(list);
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = r3;
        this.A0A = r9;
        this.A09 = r8;
        this.A08 = r7;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ boolean Bck(MotionEvent motionEvent, C05570Ua r3, int i) {
        return false;
    }
}
