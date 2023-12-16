package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.util.Objects;

/* renamed from: X.4c6  reason: invalid class name and case insensitive filesystem */
public class C89214c6 extends AnonymousClass4Rn {
    public int A00;
    public ImageButton A01;
    public BoundedLinearLayout A02;
    public ConversationAttachmentContentView A03;
    public final View A04;
    public final WaEditText A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89214c6(android.app.Activity r10, android.widget.ImageButton r11, X.C55682qk r12, X.C181568my r13, com.whatsapp.WaEditText r14, X.C620633i r15, X.AnonymousClass33p r16, X.AnonymousClass1VX r17, X.C105895Wv r18) {
        /*
            r9 = this;
            r5 = r13
            r2 = r9
            r3 = r10
            r4 = r12
            r6 = r15
            r7 = r16
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.view.View r5 = (android.view.View) r5
            r9.A04 = r5
            r9.A05 = r14
            r9.A01 = r11
            r0 = 0
            r1 = r17
            X.C162457s7.A0J(r1, r0)
            r0 = 4268(0x10ac, float:5.981E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 2131231683(0x7f0803c3, float:1.8079454E38)
            if (r1 == 0) goto L_0x0028
            r0 = 2131231702(0x7f0803d6, float:1.8079492E38)
        L_0x0028:
            r9.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89214c6.<init>(android.app.Activity, android.widget.ImageButton, X.2qk, X.8my, com.whatsapp.WaEditText, X.33i, X.33p, X.1VX, X.5Wv):void");
    }

    public void A0A(ConversationCommunityViewModel conversationCommunityViewModel, C89894fS r9, C95814uZ r10) {
        this.A02 = false;
        A04();
        C181568my r0 = this.A05;
        r0.setKeyboardPopup(this);
        boolean z = true;
        ((KeyboardPopupLayout) r0).A08 = true;
        Activity activity = this.A03;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(R.layout.f8nameremoved, relativeLayout, true);
        setContentView(relativeLayout);
        AnonymousClass4Rn.A00(this);
        AccessibilityManager A0P = this.A06.A0P();
        if (A0P == null || !A0P.isTouchExplorationEnabled()) {
            z = false;
        }
        setFocusable(z);
        setTouchInterceptor(new C100655Bt(relativeLayout, 1, this));
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) C06560Yg.A02(relativeLayout, R.id.content);
        this.A02 = boundedLinearLayout;
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) C06560Yg.A02(boundedLinearLayout, R.id.conversation_content_view);
        this.A03 = conversationAttachmentContentView;
        conversationAttachmentContentView.A09(conversationCommunityViewModel, r9, r10, false);
        relativeLayout.setVisibility(0);
        this.A02.setVisibility(0);
        C86604Kt.A0z(activity, relativeLayout, AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A01 = A08(-1);
        C107335b8.A0C(activity, this.A01, R.drawable.ib_keyboard, R.color.f5nameremoved);
        setHeight(this.A01);
        setWidth(-1);
        View view = this.A04;
        if (view != null) {
            showAtLocation(view, 8388659, 0, 1000000);
            if (A07() && "lenovo".equalsIgnoreCase(Build.MANUFACTURER)) {
                Objects.requireNonNull(view);
                view.postDelayed(new C69973Zj(view, 39), 60);
            }
        }
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            A05(new AnonymousClass92R(waEditText, 1), waEditText, new C117645sG((Object) this, 43));
        }
    }

    public void A03() {
        super.A03();
        ImageButton imageButton = this.A01;
        Activity activity = this.A03;
        C107335b8.A0C(activity, imageButton, this.A00, R.color.f5nameremoved);
        C18300x5.A13(activity, imageButton, R.string.f11nameremoved);
    }
}
