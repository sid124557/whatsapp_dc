package X;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannedString;
import android.text.TextUtils;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.6AD  reason: invalid class name */
public class AnonymousClass6AD implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6AD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A01 != 0) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
            if (!C621433s.A03(mediaComposerActivity)) {
                mediaComposerActivity.A0w.A01(mediaComposerActivity.A0t.A06());
                C114755nY r2 = mediaComposerActivity.A0w;
                boolean A07 = mediaComposerActivity.A0t.A07();
                C148287Hu r0 = r2.A05;
                if (A07) {
                    r0.A01.setFilterSwipeTextVisibility(0);
                }
                AnonymousClass4LD r6 = mediaComposerActivity.A0x;
                AnonymousClass7L6 r5 = r6.A04;
                if (r5 == null) {
                    AnonymousClass5OO r02 = r6.A03;
                    if (r02 == null) {
                        r5 = new AnonymousClass7L6((CharSequence) null, (String) null, (List) null);
                    } else {
                        CaptionView captionView = r02.A04;
                        r5 = new AnonymousClass7L6(new SpannedString(captionView.getCaptionText()), captionView.A0E.getStringText(), captionView.A0E.getMentions());
                    }
                    r6.A04 = r5;
                }
                mediaComposerActivity.A0w.A00(r5.A00, false);
                Uri A02 = mediaComposerActivity.A0t.A02();
                if (A02 != null) {
                    AnonymousClass5YF A2l = AnonymousClass4SG.A2l(A02, mediaComposerActivity);
                    A2l.A0G(r5.A01);
                    mediaComposerActivity.A12.A01(A2l.A0C(), r5.A02);
                    A2l.A0I(A2l.A0C());
                } else {
                    Log.e("MediaComposerActivity/captionentry/dismiss/current uri is null");
                }
                AnonymousClass4LD r1 = mediaComposerActivity.A0x;
                if (r1.A0A) {
                    Log.d("MediaComposerActivity/sendMedia/dialogDismiss");
                    if (mediaComposerActivity.A1i) {
                        mediaComposerActivity.A03.A0A("MediaComposer/sendMedia/avoided double send", true, TextUtils.join(", ", (Iterable) mediaComposerActivity.A0t.A03.A07()));
                        return;
                    }
                    mediaComposerActivity.A7D();
                } else if (r1.A08) {
                    mediaComposerActivity.A7P(r1.A0B);
                }
            }
        } else {
            ((AnonymousClass653) this.A00).Ayt();
        }
    }
}
