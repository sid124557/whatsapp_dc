package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.4ZS  reason: invalid class name */
public final class AnonymousClass4ZS extends AnonymousClass0R4 {
    public List A00 = C72023d3.A00;
    public final /* synthetic */ NewsletterReactionsSheet A01;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(android.view.ViewGroup r21, int r22) {
        /*
            r20 = this;
            r8 = 0
            r5 = r21
            android.view.LayoutInflater r1 = X.C86604Kt.A0E(r5, r8)
            r0 = 2131625568(0x7f0e0660, float:1.8878348E38)
            android.view.View r3 = r1.inflate(r0, r5, r8)
            r0 = 2131432881(0x7f0b15b1, float:1.8487532E38)
            com.whatsapp.WaTextView r4 = X.C86644Kx.A0O(r3, r0)
            r0 = 2131432879(0x7f0b15af, float:1.8487528E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.C86664Kz.A0w(r3, r0)
            r0 = 2131432880(0x7f0b15b0, float:1.848753E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r5.getContext()
            r7 = 1
            X.C18320x8.A19(r2, r7)
            r0 = r20
            java.util.List r6 = r0.A00
            r9 = r22
            java.lang.Object r6 = r6.get(r9)
            X.6x7 r6 = (X.C142386x7) r6
            int r6 = r6.ordinal()
            java.lang.String r10 = "reaction_senders_list_photo_loader"
            java.lang.String r11 = "viewModel"
            if (r6 == r8) goto L_0x00b6
            if (r6 != r7) goto L_0x0110
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r6 = r0.A01
            X.4Ut r8 = r6.A0B
            if (r8 != 0) goto L_0x004f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x004f:
            java.util.List r9 = r6.A0C
            int r9 = r9.size()
            r19 = 1
            if (r9 > r7) goto L_0x005b
            r19 = 0
        L_0x005b:
            X.0sA r13 = r6.A0V()
            X.5mM r9 = r6.A07
            if (r9 == 0) goto L_0x00af
            android.content.Context r7 = r6.A0G()
            X.5Uq r16 = r9.A06(r7, r10)
            X.2bj r7 = r6.A0A
            if (r7 == 0) goto L_0x00a8
            X.5ZU r15 = r6.A06
            if (r15 == 0) goto L_0x00a1
            X.5hX r14 = r6.A03
            if (r14 == 0) goto L_0x009a
            X.4xP r12 = new X.4xP
            r17 = r7
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2.setAdapter(r12)
            X.4Ut r2 = r6.A0B
            if (r2 != 0) goto L_0x008c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x008c:
            X.08M r8 = r2.A02
            X.0sA r7 = r6.A0V()
            X.63I r6 = new X.63I
            r6.<init>(r4, r12, r0)
            r2 = 298(0x12a, float:4.18E-43)
            goto L_0x010d
        L_0x009a:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a1:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a8:
            java.lang.String r0 = "anonymousProfilePicLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00af:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b6:
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r9 = r0.A01
            X.4Ut r8 = r9.A0B
            if (r8 != 0) goto L_0x00c1
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x00c1:
            java.util.List r6 = r9.A0C
            int r6 = r6.size()
            r19 = 1
            if (r6 > r7) goto L_0x00cd
            r19 = 0
        L_0x00cd:
            X.0sA r13 = r9.A0V()
            X.5mM r7 = r9.A07
            if (r7 == 0) goto L_0x014b
            android.content.Context r6 = r9.A0G()
            X.5Uq r14 = r7.A06(r6, r10)
            X.2bj r7 = r9.A0A
            if (r7 == 0) goto L_0x0144
            X.33j r15 = r9.A08
            if (r15 == 0) goto L_0x013d
            X.5UP r6 = r9.A09
            if (r6 == 0) goto L_0x0136
            X.4xO r12 = new X.4xO
            r17 = r7
            r18 = r8
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2.setAdapter(r12)
            X.4Ut r2 = r9.A0B
            if (r2 != 0) goto L_0x0100
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0100:
            X.08M r8 = r2.A00
            X.0sA r7 = r9.A0V()
            X.8Yv r6 = new X.8Yv
            r6.<init>(r4, r12, r0)
            r2 = 297(0x129, float:4.16E-43)
        L_0x010d:
            X.C86604Kt.A1N(r7, r8, r6, r2)
        L_0x0110:
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r7 = r0.A01
            X.4Ut r6 = r7.A0B
            if (r6 != 0) goto L_0x011b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x011b:
            X.0sA r2 = r7.A0V()
            X.0ni r4 = X.AnonymousClass0IT.A00(r2)
            r2 = 0
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1 r8 = new com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1
            r9 = r1
            r10 = r0
            r11 = r7
            r12 = r6
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 3
            X.C616131n.A02(r2, r8, r4, r2, r0)
            r5.addView(r3)
            return r3
        L_0x0136:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x013d:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0144:
            java.lang.String r0 = "anonymousProfilePicLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x014b:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZS.A0D(android.view.ViewGroup, int):java.lang.Object");
    }

    public AnonymousClass4ZS(NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A01 = newsletterReactionsSheet;
    }

    public int A0C() {
        return this.A00.size();
    }

    public static final /* synthetic */ void A00(WaTextView waTextView, AnonymousClass4ZS r10, long j) {
        String str;
        Resources resources;
        Context context = waTextView.getContext();
        int i = 1;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            long j2 = j;
            if (j > 100) {
                j2 = 100;
            }
            str = resources.getQuantityString(R.plurals.f9nameremoved, (int) j2, new Object[]{waTextView.getWhatsAppLocale().A0M().format(j)});
        }
        waTextView.setText(str);
        C106905aM.A04(waTextView);
        boolean z = true;
        if (r10.A00.size() > 1) {
            z = false;
            i = 8388611;
        }
        waTextView.setGravity(i | 16);
        Resources resources2 = waTextView.getResources();
        int i2 = R.dimen.f6nameremoved;
        if (z) {
            i2 = R.dimen.f6nameremoved;
        }
        waTextView.setTextSize(0, resources2.getDimension(i2));
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        C18260x0.A0P(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    public boolean A0F(View view, Object obj) {
        C18260x0.A0O(view, obj);
        return view.equals(obj);
    }
}
