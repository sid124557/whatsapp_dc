package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public abstract class C19180yt extends FrameLayout {
    public AnonymousClass64J A00;
    public AnonymousClass5UX A01;
    public C613330g A02;
    public C620633i A03;
    public C56982ss A04;
    public AnonymousClass5QQ A05;
    public C60152y5 A06;

    public abstract CardView getCardView();

    public abstract TextView getFollowersView();

    public abstract AnonymousClass5YB getNameViewController();

    public abstract ImageView getThumbnailView();

    public final void setChatsCache(C56982ss r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setContactAvatars(AnonymousClass5UX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotosBitmapManager(C613330g r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setNewsletterNumberFormatter(AnonymousClass5QQ r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C60152y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass64J r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Drawable A00(Bitmap bitmap) {
        int A042;
        if (bitmap != null) {
            A042 = -16777216;
            AnonymousClass0QX r0 = new AnonymousClass0OY(bitmap).A00().A01;
            if (r0 != null) {
                A042 = r0.A08;
            }
        } else {
            A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
        }
        int A032 = AnonymousClass0YI.A03(0.3f, A042, -1);
        int A033 = AnonymousClass0YI.A03(0.3f, A042, -16777216);
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A032, A033});
    }

    public final C56982ss getChatsCache() {
        C56982ss r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final AnonymousClass5UX getContactAvatars() {
        AnonymousClass5UX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public final C613330g getContactPhotosBitmapManager() {
        C613330g r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactPhotosBitmapManager");
    }

    public final AnonymousClass5QQ getNewsletterNumberFormatter() {
        AnonymousClass5QQ r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterNumberFormatter");
    }

    public final C60152y5 getSharedPreferencesFactory() {
        C60152y5 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final AnonymousClass64J getTextEmojiLabelViewControllerFactory() {
        AnonymousClass64J r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("textEmojiLabelViewControllerFactory");
    }

    public C19180yt(Context context) {
        super(context);
    }
}
