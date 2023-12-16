package X;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.4nj  reason: invalid class name and case insensitive filesystem */
public abstract class C93014nj extends C93244oC {
    public int A00 = 0;
    public final View A01 = C06560Yg.A02(this, R.id.view_once_media_container_small);
    public final View A02 = C06560Yg.A02(this, R.id.conversation_row_root);
    public final WaTextView A03 = AnonymousClass0x7.A0L(this, R.id.view_once_media_type_small);
    public final ViewOnceDownloadProgressView A04 = ((ViewOnceDownloadProgressView) C06560Yg.A02(this, R.id.view_once_download_small));

    public void A1H() {
        A1t(false);
        A29();
    }

    public final void A2B() {
        Integer[] numArr = new Integer[5];
        boolean A1Y = C18300x5.A1Y(numArr, R.string.f11nameremoved);
        AnonymousClass000.A1M(numArr, R.string.f11nameremoved);
        AnonymousClass000.A1N(numArr, R.string.f11nameremoved);
        AnonymousClass000.A1O(numArr, R.string.f11nameremoved);
        C18280x3.A1P(numArr, R.string.f11nameremoved);
        Iterator it = Arrays.asList(numArr).iterator();
        while (it.hasNext()) {
            String A0b = C86624Kv.A0b(this, C18280x3.A05(it));
            SpannableStringBuilder A002 = C18330xA.A00(A0b);
            getContext();
            A002.setSpan(new AnonymousClass4N1(), A1Y ? 1 : 0, A0b.length(), A1Y);
            this.A00 = C86654Ky.A02(getResources(), R.dimen.f6nameremoved, Math.max(this.A00, (int) Layout.getDesiredWidth(A002, this.A03.getPaint())));
        }
    }

    public static void A00(ViewOnceDownloadProgressView viewOnceDownloadProgressView, C30471mV r5, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i == 0 || i == 1) {
            i2 = R.drawable.ic_viewonce_cancel;
            i3 = -1;
            viewOnceDownloadProgressView.A00(i2, i3, R.color.f5nameremoved);
        } else {
            if (i == 2) {
                if (!z) {
                    i4 = R.drawable.ic_viewonce_one;
                }
                i2 = R.drawable.ic_viewonce_one;
                i3 = R.drawable.ic_ephemeral_ring;
                viewOnceDownloadProgressView.A00(i2, i3, R.color.f5nameremoved);
            } else if (i == 3) {
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_retry, -1, AnonymousClass34K.A01(viewOnceDownloadProgressView.getContext(), R.attr.f3nameremoved));
            } else {
                if (!z) {
                    i4 = R.drawable.ic_viewonce_download;
                }
                i2 = R.drawable.ic_viewonce_one;
                i3 = R.drawable.ic_ephemeral_ring;
                viewOnceDownloadProgressView.A00(i2, i3, R.color.f5nameremoved);
            }
            viewOnceDownloadProgressView.A00(i4, R.drawable.ic_ephemeral_ring, AnonymousClass34K.A01(viewOnceDownloadProgressView.getContext(), R.attr.f3nameremoved));
        }
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            C106805aC.A01(viewOnceDownloadProgressView.A01, r5, viewOnceDownloadProgressView.A05);
        }
        viewOnceDownloadProgressView.setVisibility(0);
    }

    public void A28() {
        this.A04.A00(R.drawable.ic_ephemeral_ring, -1, R.color.f5nameremoved);
        WaTextView waTextView = this.A03;
        C18320x8.A11(getResources(), waTextView, R.color.f5nameremoved);
        waTextView.A09();
        A2A();
        C18300x5.A13(C86634Kw.A0B(this.A01, this), waTextView, getMediaTypeDescriptionString());
    }

    public void A29() {
        if (this.A0n.BHf(getFMessage())) {
            C86644Kx.A0y(this.A02, -1);
        }
    }

    public void A2A() {
        if (this.A00 == 0) {
            A2B();
        }
        this.A03.setWidth(this.A00);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30471mV);
        super.setFMessage(r2);
    }

    public C93014nj(Context context, AnonymousClass677 r3, C30471mV r4) {
        super(context, r3, r4);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A29();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2C(android.view.View r7, int r8, boolean r9) {
        /*
            r6 = this;
            X.C107295b4.A01(r7)
            r0 = 1
            X.AnonymousClass0YY.A06(r7, r0)
            if (r8 == 0) goto L_0x00f0
            if (r8 == r0) goto L_0x00f8
            r2 = 0
            r1 = 2
            if (r8 == r1) goto L_0x00d1
            r0 = 3
            if (r8 == r0) goto L_0x00bd
            if (r9 != 0) goto L_0x00e8
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C18300x5.A13(r1, r7, r0)
            X.5ez r0 = r6.A09
            r7.setOnClickListener(r0)
            r0 = 2131887188(0x7f120454, float:1.9408976E38)
        L_0x0027:
            X.C107295b4.A03(r7, r0)
        L_0x002a:
            X.C93314oJ.A0q(r7, r6)
            r3 = r6
            boolean r0 = r6 instanceof X.C93004ni
            if (r0 == 0) goto L_0x00ad
            r0 = 3
            if (r8 != r0) goto L_0x0070
            com.whatsapp.WaTextView r2 = r6.A03
            r6.getContext()
            android.content.Context r1 = r6.getContext()
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
        L_0x0041:
            java.lang.String r0 = r1.getString(r0)
            android.text.Spannable r0 = X.C107635bd.A01(r0)
            r2.setText(r0)
        L_0x004c:
            if (r9 == 0) goto L_0x0066
            r0 = 3
            if (r8 != r0) goto L_0x0066
            com.whatsapp.WaTextView r2 = r6.A03
            android.content.res.Resources r1 = r6.getResources()
            int r0 = X.AnonymousClass5Yj.A07(r2)
        L_0x005b:
            X.C18320x8.A11(r1, r2, r0)
            r2.A0A()
            r0 = 0
            r7.setVisibility(r0)
            return
        L_0x0066:
            com.whatsapp.WaTextView r2 = r6.A03
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131102647(0x7f060bb7, float:1.7817738E38)
            goto L_0x005b
        L_0x0070:
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeString()
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r5 = X.C18330xA.A00(r0)
            r0 = 8203(0x200b, float:1.1495E-41)
            android.text.SpannableStringBuilder r4 = r5.append(r0)
            r0 = 2
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r0)
            int r0 = r5.length()
            int r2 = r0 + -1
            int r0 = r5.length()
            int r1 = r0 + -1
            r0 = 0
            r4.setSpan(r3, r2, r1, r0)
            com.whatsapp.WaTextView r2 = r6.A03
            r2.setText(r5)
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C18300x5.A13(r1, r2, r0)
            goto L_0x004c
        L_0x00ad:
            X.4oA r3 = (X.C93224oA) r3
            com.whatsapp.WaTextView r2 = r3.A06
            r3.getContext()
            android.content.Context r1 = r3.getContext()
            int r0 = r3.getMediaTypeString()
            goto L_0x0041
        L_0x00bd:
            android.content.Context r0 = r6.getContext()
            r1 = 2131893203(0x7f121bd3, float:1.9421176E38)
            X.C18300x5.A13(r0, r7, r1)
            X.5ez r0 = r6.A0A
            r7.setOnClickListener(r0)
            X.C107295b4.A03(r7, r1)
            goto L_0x002a
        L_0x00d1:
            if (r9 != 0) goto L_0x00e8
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C18300x5.A13(r1, r7, r0)
            X.5ez r0 = r6.A0B
            r7.setOnClickListener(r0)
            r0 = 2131895042(0x7f122302, float:1.9424906E38)
            goto L_0x0027
        L_0x00e8:
            r7.setOnClickListener(r2)
            X.AnonymousClass0YY.A06(r7, r1)
            goto L_0x002a
        L_0x00f0:
            android.content.Context r1 = r6.getContext()
            r0 = 2131894315(0x7f12202b, float:1.9423431E38)
            goto L_0x00ff
        L_0x00f8:
            android.content.Context r1 = r6.getContext()
            r0 = 2131894314(0x7f12202a, float:1.942343E38)
        L_0x00ff:
            X.C18300x5.A13(r1, r7, r0)
            X.5ez r0 = r6.A08
            r7.setOnClickListener(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93014nj.A2C(android.view.View, int, boolean):void");
    }

    public int getMediaTypeDescriptionString() {
        AnonymousClass4DU r1 = (AnonymousClass4DU) getFMessage();
        boolean z = r1 instanceof C31991pD;
        int BEM = r1.BEM();
        if (z) {
            if (BEM == 1 || BEM == 2) {
                return R.string.f11nameremoved;
            }
            return R.string.f11nameremoved;
        } else if (BEM == 1 || BEM == 2) {
            return R.string.f11nameremoved;
        } else {
            return R.string.f11nameremoved;
        }
    }

    public int getMediaTypeString() {
        C30471mV fMessage = getFMessage();
        if (!(fMessage instanceof C31991pD) && (fMessage instanceof C30711mt)) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A2B();
        A2A();
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
