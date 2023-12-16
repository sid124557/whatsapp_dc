package X;

import android.view.View;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.8Wk  reason: invalid class name and case insensitive filesystem */
public final class C174928Wk extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ WDSTextLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174928Wk(WDSTextLayout wDSTextLayout) {
        super(0);
        this.this$0 = wDSTextLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C141616vr r3;
        AnonymousClass7YW r32;
        AnonymousClass7YW r0;
        AnonymousClass75V r7;
        C141616vr r33;
        AnonymousClass7YW r8;
        AnonymousClass7YW r9;
        WDSTextLayout wDSTextLayout = this.this$0;
        C141376vT layoutStyle = wDSTextLayout.getLayoutStyle();
        if (layoutStyle != null) {
            int ordinal = layoutStyle.ordinal();
            if (ordinal == 0) {
                C141636vt layoutSize = wDSTextLayout.getLayoutSize();
                if (layoutSize == null) {
                    layoutSize = C141636vt.MEDIUM;
                }
                C162457s7.A0J(layoutSize, 0);
                int ordinal2 = layoutSize.ordinal();
                if (ordinal2 == 0) {
                    r3 = C141616vr.SMALL;
                } else if (ordinal2 == 1) {
                    r3 = C141616vr.MEDIUM;
                } else {
                    throw C73153f1.A00();
                }
                AnonymousClass7ZQ r6 = new AnonymousClass7ZQ(wDSTextLayout.getHeaderImage(), r3, wDSTextLayout.getHeadlineText(), wDSTextLayout.getDescriptionText());
                CharSequence footnoteText = wDSTextLayout.getFootnoteText();
                String primaryButtonText = wDSTextLayout.getPrimaryButtonText();
                View.OnClickListener primaryButtonClickListener = wDSTextLayout.getPrimaryButtonClickListener();
                if (primaryButtonText != null) {
                    r32 = new AnonymousClass7YW(primaryButtonClickListener, primaryButtonText);
                } else {
                    r32 = null;
                }
                String secondaryButtonText = wDSTextLayout.getSecondaryButtonText();
                View.OnClickListener secondaryButtonClickListener = wDSTextLayout.getSecondaryButtonClickListener();
                if (secondaryButtonText != null) {
                    r0 = new AnonymousClass7YW(secondaryButtonClickListener, secondaryButtonText);
                } else {
                    r0 = null;
                }
                r7 = new C140086t8(r32, r0, r6, footnoteText);
            } else if (ordinal == 1) {
                C141636vt layoutSize2 = wDSTextLayout.getLayoutSize();
                if (layoutSize2 == null) {
                    layoutSize2 = C141636vt.MEDIUM;
                }
                C162457s7.A0J(layoutSize2, 0);
                int ordinal3 = layoutSize2.ordinal();
                if (ordinal3 == 0) {
                    r33 = C141616vr.SMALL;
                } else if (ordinal3 == 1) {
                    r33 = C141616vr.MEDIUM;
                } else {
                    throw C73153f1.A00();
                }
                AnonymousClass7ZQ r10 = new AnonymousClass7ZQ(wDSTextLayout.getHeaderImage(), r33, wDSTextLayout.getHeadlineText(), wDSTextLayout.getDescriptionText());
                C141626vs footnotePosition = wDSTextLayout.getFootnotePosition();
                if (footnotePosition == null) {
                    footnotePosition = C141626vs.CONTENT_END;
                }
                AnonymousClass75U content = wDSTextLayout.getContent();
                CharSequence footnoteText2 = wDSTextLayout.getFootnoteText();
                String primaryButtonText2 = wDSTextLayout.getPrimaryButtonText();
                View.OnClickListener primaryButtonClickListener2 = wDSTextLayout.getPrimaryButtonClickListener();
                if (primaryButtonText2 != null) {
                    r8 = new AnonymousClass7YW(primaryButtonClickListener2, primaryButtonText2);
                } else {
                    r8 = null;
                }
                String secondaryButtonText2 = wDSTextLayout.getSecondaryButtonText();
                View.OnClickListener secondaryButtonClickListener2 = wDSTextLayout.getSecondaryButtonClickListener();
                if (secondaryButtonText2 != null) {
                    r9 = new AnonymousClass7YW(secondaryButtonClickListener2, secondaryButtonText2);
                } else {
                    r9 = null;
                }
                r7 = new C140096t9(r8, r9, r10, footnotePosition, content, footnoteText2);
            } else {
                throw C73153f1.A00();
            }
            wDSTextLayout.setTextLayoutViewState(r7);
        }
        return C59022wD.A00;
    }
}
