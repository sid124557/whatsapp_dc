package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;

/* renamed from: X.4Rx  reason: invalid class name */
public final class AnonymousClass4Rx extends RelativeLayout implements AnonymousClass4GJ {
    public FrameLayout A00;
    public AnonymousClass1VX A01;
    public AnonymousClass4FV A02;
    public C179388j4 A03;
    public C179398j5 A04;
    public AddScreenshotImageView A05;
    public AnonymousClass5UY A06;
    public AnonymousClass5UY A07;
    public C116855qy A08;
    public boolean A09;

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setAddScreenshotImageView(AddScreenshotImageView addScreenshotImageView) {
        C162457s7.A0J(addScreenshotImageView, 0);
        this.A05 = addScreenshotImageView;
    }

    public final void setOnRemoveScreenshotListener(C179388j4 r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setOnRetryListener(C179398j5 r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setRemoveButton(FrameLayout frameLayout) {
        C162457s7.A0J(frameLayout, 0);
        this.A00 = frameLayout;
    }

    public final void setScreenshot(Bitmap bitmap) {
        C162457s7.A0J(bitmap, 0);
        getAddScreenshotImageView().setScreenshot(bitmap);
        if (getAbProps().A0X(4697)) {
            setRemoveButtonVisibility(false);
        } else {
            setRemoveButtonVisibility(true);
        }
    }

    public final void setWamRuntime(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final AddScreenshotImageView getAddScreenshotImageView() {
        AddScreenshotImageView addScreenshotImageView = this.A05;
        if (addScreenshotImageView != null) {
            return addScreenshotImageView;
        }
        throw C18270x1.A0S("addScreenshotImageView");
    }

    public final FrameLayout getRemoveButton() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw C18270x1.A0S("removeButton");
    }

    public final AnonymousClass4FV getWamRuntime() {
        AnonymousClass4FV r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("wamRuntime");
    }

    public final void setRetryLayoutVisibility(boolean z) {
        AnonymousClass5UY r1 = this.A07;
        if (r1 == null) {
            throw C18270x1.A0S("mediaUploadRetryViewStubHolder");
        }
        r1.A06(AnonymousClass001.A08(z ? 1 : 0));
    }

    public final void setUploadProgressBarVisibility(boolean z) {
        AnonymousClass5UY r1 = this.A06;
        if (r1 == null) {
            throw C18270x1.A0S("mediaUploadProgressViewStubHolder");
        }
        r1.A06(AnonymousClass001.A08(z ? 1 : 0));
    }

    public AnonymousClass4Rx(Context context) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A4H(A002);
            this.A01 = C64333Db.A4B(A002);
        }
        View inflate = View.inflate(getContext(), R.layout.f8nameremoved, this);
        setAddScreenshotImageView((AddScreenshotImageView) C18290x4.A0M(inflate, R.id.screenshot_imageview));
        setRemoveButton((FrameLayout) C18290x4.A0M(inflate, R.id.remove_button));
        this.A06 = C18290x4.A0X(inflate, R.id.media_upload_progress_bar_stub);
        this.A07 = C18290x4.A0X(inflate, R.id.media_upload_retry_stub);
        setRemoveButtonVisibility(false);
        C635439q.A00(getRemoveButton(), this, 29);
        AnonymousClass5UY r2 = this.A07;
        if (r2 == null) {
            throw C18270x1.A0S("mediaUploadRetryViewStubHolder");
        }
        r2.A07(new C635439q((Object) this, 30));
    }

    public final void A00() {
        AddScreenshotImageView addScreenshotImageView = getAddScreenshotImageView();
        Bitmap bitmap = addScreenshotImageView.A07;
        if (bitmap != null) {
            bitmap.recycle();
            addScreenshotImageView.A07 = null;
        }
        addScreenshotImageView.A07();
        setRemoveButtonVisibility(false);
    }

    public final void setRemoveButtonVisibility(boolean z) {
        getRemoveButton().setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }
}
