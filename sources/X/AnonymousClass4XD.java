package X;

import android.os.Bundle;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4XD  reason: invalid class name */
public class AnonymousClass4XD extends AnonymousClass0R6 {
    public static final Range A0J = new Range(C18280x3.A0S(), C18290x4.A0b());
    public int A00 = R.style.f12nameremoved;
    public RecyclerView A01;
    public AnonymousClass7D2 A02;
    public AnonymousClass5MO A03;
    public CallGridViewModel A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass5E5 A07;
    public final AnonymousClass5E6 A08;
    public final AnonymousClass5E7 A09;
    public final AnonymousClass5E8 A0A;
    public final AnonymousClass5E9 A0B;
    public final AnonymousClass5EA A0C;
    public final AnonymousClass5EB A0D;
    public final AnonymousClass8GN A0E;
    public final C56602sG A0F = new C189088zy(this, 2);
    public final AnonymousClass1VX A0G;
    public final C187958y5 A0H;
    public final List A0I = AnonymousClass001.A0s();

    public void A0D(RecyclerView recyclerView) {
        this.A01 = null;
    }

    public AnonymousClass4Z7 A0L(View view, int i) {
        return A0M(view, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r16 != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r3 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4Z7 A0M(android.view.View r15, int r16, boolean r17) {
        /*
            r14 = this;
            r2 = 0
            r1 = 1
            r0 = 2
            r4 = r15
            r3 = r16
            if (r3 == r0) goto L_0x0046
            if (r3 == r1) goto L_0x0046
            r12 = 0
            switch(r16) {
                case 3: goto L_0x0048;
                case 4: goto L_0x0070;
                case 5: goto L_0x0098;
                case 6: goto L_0x0048;
                case 7: goto L_0x0048;
                case 8: goto L_0x0048;
                case 9: goto L_0x00c0;
                case 10: goto L_0x00d8;
                case 11: goto L_0x00f2;
                default: goto L_0x000e;
            }
        L_0x000e:
            if (r16 == 0) goto L_0x0014
        L_0x0010:
            if (r3 == r1) goto L_0x0014
            if (r3 != r0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            java.lang.String r0 = "Unknown view holder type"
            X.C626936e.A0D(r2, r0)
            X.5E5 r0 = r14.A07
            X.7D2 r6 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r7 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r1 = r0.A03
            X.1VX r11 = X.C64333Db.A4B(r1)
            X.5ZU r10 = X.C64333Db.A28(r1)
            X.5UX r9 = X.C86614Ku.A0R(r1)
            X.5bk r0 = r1.A00
            X.4C1 r0 = r0.ABw
            java.lang.Object r8 = r0.get()
            X.5qe r8 = (X.C116655qe) r8
            X.30B r5 = X.C86624Kv.A0M(r1)
            X.4j9 r3 = new X.4j9
            r13 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0046:
            r12 = 1
            goto L_0x0010
        L_0x0048:
            X.5E7 r0 = r14.A09
            X.7D2 r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.1VX r12 = X.C64333Db.A4B(r0)
            X.5ZU r10 = X.C64333Db.A28(r0)
            X.5UX r9 = X.C86614Ku.A0R(r0)
            X.30B r6 = X.C86624Kv.A0M(r0)
            X.33j r11 = X.C64333Db.A2t(r0)
            X.64J r5 = X.C86614Ku.A0N(r0)
            X.4j8 r3 = new X.4j8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x0070:
            X.5E8 r0 = r14.A0A
            X.7D2 r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.1VX r12 = X.C64333Db.A4B(r0)
            X.5ZU r10 = X.C64333Db.A28(r0)
            X.5UX r9 = X.C86614Ku.A0R(r0)
            X.30B r6 = X.C86624Kv.A0M(r0)
            X.33j r11 = X.C64333Db.A2t(r0)
            X.64J r5 = X.C86614Ku.A0N(r0)
            X.4j7 r3 = new X.4j7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x0098:
            X.5E6 r0 = r14.A08
            X.7D2 r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.1VX r12 = X.C64333Db.A4B(r0)
            X.5ZU r10 = X.C64333Db.A28(r0)
            X.5UX r9 = X.C86614Ku.A0R(r0)
            X.30B r6 = X.C86624Kv.A0M(r0)
            X.33j r11 = X.C64333Db.A2t(r0)
            X.64J r5 = X.C86614Ku.A0N(r0)
            X.4j6 r3 = new X.4j6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00c0:
            X.5EA r0 = r14.A0C
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.5ZU r2 = X.C64333Db.A28(r0)
            X.5UX r1 = X.C86614Ku.A0R(r0)
            X.30B r0 = X.C86624Kv.A0M(r0)
            X.6ft r3 = new X.6ft
            r3.<init>(r15, r0, r1, r2)
            return r3
        L_0x00d8:
            X.5E9 r0 = r14.A0B
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r6 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.30B r5 = X.C86624Kv.A0M(r0)
            X.5UX r7 = X.C86614Ku.A0R(r0)
            X.5ZU r8 = X.C64333Db.A28(r0)
            X.4j4 r3 = new X.4j4
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x00f2:
            X.5EB r0 = r14.A0D
            X.7D2 r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            X.5sx r0 = r0.A00
            X.3Db r0 = r0.A03
            X.1VX r12 = X.C64333Db.A4B(r0)
            X.5ZU r10 = X.C64333Db.A28(r0)
            X.5UX r9 = X.C86614Ku.A0R(r0)
            X.30B r6 = X.C86624Kv.A0M(r0)
            X.33j r11 = X.C64333Db.A2t(r0)
            X.64J r5 = X.C86614Ku.A0N(r0)
            X.4j5 r3 = new X.4j5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XD.A0M(android.view.View, int, boolean):X.4Z7");
    }

    public int A0G() {
        return this.A0I.size();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r1) {
        ((AnonymousClass4Z7) r1).A08();
    }

    public void A0N(int i) {
        if (!(this instanceof C91174j2)) {
            this.A00 = i;
        }
    }

    /* renamed from: A0P */
    public void A0A(AnonymousClass4Z7 r8, List list, int i) {
        int i2;
        if (i >= 0) {
            List list2 = this.A0I;
            if (i < list2.size()) {
                r8.A0G((C105175Tw) list2.get(i));
                boolean z = false;
                if (list.size() > 0 && (list.get(0) instanceof Bundle) && ((Bundle) list.get(0)).getBoolean("update_contact")) {
                    r8.A07();
                }
                if (this.A05) {
                    i2 = 2;
                } else if ((r8 instanceof C91224j8) && this.A01 != null && !(this instanceof C91174j2) && !this.A06) {
                    int size = list2.size();
                    AnonymousClass8GN r2 = this.A0E;
                    int height = this.A01.getHeight();
                    CallGridViewModel callGridViewModel = this.A04;
                    if (callGridViewModel != null && C86604Kt.A1Z(callGridViewModel.A0l)) {
                        z = true;
                    }
                    int A002 = r2.A00(size, height, z);
                    Log.i("VoiceParticipantViewHolder/setItemViewHeight get called");
                    View view = r8.A0H;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i3 = layoutParams.height;
                    if (i3 != A002) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("VoiceParticipantViewHolder/setItemViewHeight Height Mismatch, layoutParams.height: ");
                        A0o.append(i3);
                        C18260x0.A0y(", itemViewHeightPx: ", A0o, A002);
                        layoutParams.height = A002;
                        view.setLayoutParams(layoutParams);
                    }
                    i2 = 2;
                    if (size <= 2) {
                        i2 = 0;
                    } else if (size <= 8) {
                        i2 = 1;
                    }
                } else {
                    return;
                }
                r8.A0A(i2);
                return;
            }
        }
        Log.w("CallGridAdapter/onCreateViewHolder index out of bounds");
    }

    public void A0Q(UserJid userJid) {
        if (userJid != null) {
            int i = 0;
            while (true) {
                List list = this.A0I;
                if (i >= list.size()) {
                    return;
                }
                if (!userJid.equals(((C105175Tw) list.get(i)).A0b)) {
                    i++;
                } else if (i != -1) {
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putBoolean("update_contact", true);
                    this.A01.A04(A082, i, 1);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void A0R(List list) {
        List list2 = this.A0I;
        AnonymousClass0U0 A002 = AnonymousClass0SC.A00(new AnonymousClass6HB(list2, list));
        this.A06 = AnonymousClass001.A1X(list2.size(), list.size());
        list2.clear();
        list2.addAll(list);
        A002.A02(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C91174j2
            if (r0 == 0) goto L_0x0025
            if (r6 < 0) goto L_0x0023
            java.util.List r1 = r5.A0I
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x0023
            java.lang.Object r0 = r1.get(r6)
            X.5Tw r0 = (X.C105175Tw) r0
        L_0x0014:
            r4 = 9
            if (r0 == 0) goto L_0x0022
            boolean r1 = r0.A0B
            if (r1 != 0) goto L_0x0022
            boolean r0 = r0.A0A
            r4 = 0
            if (r0 == 0) goto L_0x0022
            r4 = 3
        L_0x0022:
            return r4
        L_0x0023:
            r0 = 0
            goto L_0x0014
        L_0x0025:
            if (r6 < 0) goto L_0x007b
            java.util.List r2 = r5.A0I
            int r0 = r2.size()
            if (r6 >= r0) goto L_0x007b
            java.lang.Object r1 = r2.get(r6)
            X.5Tw r1 = (X.C105175Tw) r1
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x007b
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0042
            r1 = 10
        L_0x0041:
            return r1
        L_0x0042:
            boolean r0 = r5.A05
            r3 = 3
            if (r0 != 0) goto L_0x0059
            int r2 = r2.size()
            boolean r0 = r1.A0K
            r4 = 6
            if (r0 == 0) goto L_0x005a
            boolean r0 = r1.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0041
            r0 = 4
            if (r2 > r0) goto L_0x0059
            r3 = 6
        L_0x0059:
            return r3
        L_0x005a:
            r0 = 1
            if (r2 != r0) goto L_0x0064
            boolean r0 = r1.A0C
            r1 = 5
            if (r0 == 0) goto L_0x0041
            r1 = 4
            return r1
        L_0x0064:
            android.util.Range r1 = A0J
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0059
            X.1VX r1 = r5.A0G
            r0 = 5055(0x13bf, float:7.084E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0059
            return r4
        L_0x007b:
            r1 = 9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XD.getItemViewType(int):int");
    }

    public AnonymousClass4XD(AnonymousClass5E5 r3, AnonymousClass5E6 r4, AnonymousClass5E7 r5, AnonymousClass5E8 r6, AnonymousClass5E9 r7, AnonymousClass5EA r8, AnonymousClass5EB r9, AnonymousClass8GN r10, AnonymousClass1VX r11, C187958y5 r12) {
        this.A0G = r11;
        this.A07 = r3;
        this.A08 = r4;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
        this.A0C = r8;
        this.A0D = r9;
        this.A0H = r12;
        this.A0E = r10;
    }

    public void A0C(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }

    public View A0K(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        C000500m r0 = new C000500m(viewGroup.getContext(), this.A00);
        switch (i) {
            case 1:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 3:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 4:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 5:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 6:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 7:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 8:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 9:
                FrameLayout frameLayout = new FrameLayout(r0);
                C86624Kv.A0x(frameLayout, -1);
                return frameLayout;
            case 10:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            case 11:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
            default:
                from = LayoutInflater.from(r0);
                i2 = R.layout.f8nameremoved;
                break;
        }
        return from.inflate(i2, viewGroup, false);
    }

    /* renamed from: A0O */
    public void BNf(AnonymousClass4Z7 r2, int i) {
        A0A(r2, AnonymousClass001.A0s(), i);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C18260x0.A0y("CallGridAdapter/onCreateViewHolder, viewType: ", AnonymousClass001.A0o(), i);
        AnonymousClass4Z7 A0L = A0L(A0K(i, viewGroup), i);
        boolean z = true;
        if (!(i == 7 || i == 8 || i == 1)) {
            z = false;
        }
        A0L.A09 = z;
        A0L.A0F(this.A03);
        return A0L;
    }
}
