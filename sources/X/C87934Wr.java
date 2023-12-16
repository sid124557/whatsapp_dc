package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Wr  reason: invalid class name and case insensitive filesystem */
public final class C87934Wr extends AnonymousClass0R6 {
    public List A00;
    public final C101065Di A01;
    public final C179598jP A02;
    public final List A03;

    public final void A0K(AnonymousClass59R r6, String str) {
        C162457s7.A0J(r6, 0);
        List<AnonymousClass59R> list = this.A03;
        ArrayList A0c = C73783g4.A0c(list);
        for (AnonymousClass59R r2 : list) {
            AnonymousClass5SD r1 = new AnonymousClass5SD(r2, AnonymousClass000.A1Y(r2, r6));
            if (r2 == AnonymousClass59R.COUNTRY) {
                r1.A00 = str;
            }
            A0c.add(r1);
        }
        this.A00 = A0c;
        A05();
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        C101065Di r3 = this.A01;
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        TextView textView = (TextView) inflate;
        C106905aM.A04(textView);
        return new AnonymousClass4YJ(textView, (C49122g1) r3.A00.A03.ANg.get(), this);
    }

    public int A0G() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0066, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r8, int r9) {
        /*
            r7 = this;
            X.4YJ r8 = (X.AnonymousClass4YJ) r8
            r1 = 0
            X.C162457s7.A0J(r8, r1)
            java.util.List r0 = r7.A00
            java.lang.Object r6 = r0.get(r9)
            X.5SD r6 = (X.AnonymousClass5SD) r6
            X.C162457s7.A0J(r6, r1)
            X.59R r5 = r6.A01
            com.google.android.material.chip.Chip r4 = r8.A00
            java.lang.CharSequence r0 = r4.getText()
            r4.setContentDescription(r0)
            boolean r0 = r6.A02
            r4.setChecked(r0)
            r4.setCheckedIconVisible((boolean) r1)
            android.content.Context r0 = X.C18290x4.A0F(r4)
            java.lang.String r0 = r5.A01(r0)
            r4.setText(r0)
            X.59R r0 = X.AnonymousClass59R.COUNTRY
            if (r5 != r0) goto L_0x006c
            r3 = 2131101268(0x7f060654, float:1.781494E38)
            r2 = 1
            r4.setChipIconVisible((boolean) r2)
            r0 = 2131232816(0x7f080830, float:1.8081752E38)
            r4.setChipIconResource(r0)
            r4.setChipIconTintResource(r3)
            r0 = 2131167905(0x7f070aa1, float:1.7950097E38)
            r4.setChipIconSizeResource(r0)
            r1 = 2131165729(0x7f070221, float:1.7945683E38)
            r4.setIconStartPaddingResource(r1)
            r4.setCloseIconVisible((boolean) r2)
            r0 = 2131233967(0x7f080caf, float:1.8084086E38)
            r4.setCloseIconResource(r0)
            r4.setCloseIconTintResource(r3)
            r4.setCloseIconEndPaddingResource(r1)
            X.2g1 r1 = r8.A01
            java.lang.String r0 = r6.A00
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0072
        L_0x0068:
            r4.setText(r0)
            return
        L_0x006c:
            r4.setChipIconVisible((boolean) r1)
            r4.setCloseIconVisible((boolean) r1)
        L_0x0072:
            android.content.Context r0 = X.C18290x4.A0F(r4)
            java.lang.String r0 = r5.A01(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87934Wr.BNf(X.0Ua, int):void");
    }

    public C87934Wr(C101065Di r9, AnonymousClass1VX r10, C179598jP r11) {
        ArrayList arrayList;
        C18260x0.A0Q(r10, r9);
        this.A01 = r9;
        this.A02 = r11;
        String A0Q = r10.A0Q(5127);
        if (A0Q != null) {
            List A012 = AnonymousClass2AB.A01(A0Q, ",");
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                Integer A06 = C829745q.A06(AnonymousClass2AB.A00(AnonymousClass001.A0m(it)));
                if (A06 != null) {
                    A0s.add(A06);
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                int A05 = C18280x3.A05(it2);
                AnonymousClass59R[] values = AnonymousClass59R.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    AnonymousClass59R r1 = values[i];
                    if (r1.value == A05) {
                        A0s2.add(r1);
                        break;
                    }
                    i++;
                }
            }
            arrayList = AnonymousClass002.A0J(A0s2);
        } else {
            arrayList = AnonymousClass001.A0s();
        }
        this.A03 = arrayList;
        this.A00 = AnonymousClass001.A0s();
    }
}
