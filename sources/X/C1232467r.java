package X;

import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.67r  reason: invalid class name and case insensitive filesystem */
public class C1232467r extends C167047zg {
    public Object A00;
    public final int A01;

    public C1232467r(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C1232467r(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a0, code lost:
        r1.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x00c1;
                case 2: goto L_0x0107;
                case 3: goto L_0x0009;
                case 4: goto L_0x0005;
                case 5: goto L_0x0065;
                case 6: goto L_0x0129;
                case 7: goto L_0x013b;
                case 8: goto L_0x013b;
                case 9: goto L_0x00a3;
                case 10: goto L_0x0147;
                case 11: goto L_0x001f;
                case 12: goto L_0x0027;
                case 13: goto L_0x0174;
                case 14: goto L_0x018b;
                case 15: goto L_0x0196;
                case 16: goto L_0x00b3;
                case 17: goto L_0x002f;
                case 18: goto L_0x004f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r8)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r7.A00
            X.4fR r2 = (X.C89884fR) r2
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            r1.width = r0
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            goto L_0x00bd
        L_0x001f:
            java.lang.Object r0 = r7.A00
            X.5qb r0 = (X.C116635qb) r0
            android.widget.ImageButton r0 = r0.A0C
            goto L_0x00bd
        L_0x0027:
            java.lang.Object r0 = r7.A00
            X.5qb r0 = (X.C116635qb) r0
            android.widget.ImageButton r0 = r0.A0D
            goto L_0x00bd
        L_0x002f:
            java.lang.Object r3 = r7.A00
            X.5qb r3 = (X.C116635qb) r3
            r0 = 8
            X.5UY r2 = r3.A0J
            r2.A06(r0)
            r1 = 0
            android.view.ViewGroup r0 = r3.A0A
            r0.setVisibility(r1)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r3.A0G
            r0.setVisibility(r1)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A04
            r0.setProgress(r1)
            android.view.View r0 = r2.A04()
            goto L_0x00bd
        L_0x004f:
            super.onAnimationEnd(r8)
            java.lang.Object r0 = r7.A00
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.LinearLayout r0 = r0.A0E
            goto L_0x00bd
        L_0x0059:
            java.lang.Object r0 = r7.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            androidx.appcompat.widget.SearchView r0 = r0.A0O
            if (r0 == 0) goto L_0x0008
            r0.A09()
            return
        L_0x0065:
            java.lang.String r0 = "conversation/showinputextension/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r7.A00
            X.5fX r3 = (X.C110005fX) r3
            X.5l7 r2 = r3.A03
            com.whatsapp.KeyboardPopupLayout r1 = r2.A1a
            r0 = 1
            r1.setClipChildren(r0)
            r0 = 0
            r2.A05 = r0
            com.whatsapp.conversation.ConversationListView r1 = r2.A2f
            int r0 = r3.A00
            r1.setTranscriptMode(r0)
            android.view.ViewGroup r1 = r3.A02
            android.view.ViewGroup r0 = r2.A0a
            if (r1 != r0) goto L_0x0008
            X.5KX r0 = r2.A2p
            if (r0 == 0) goto L_0x0008
            com.whatsapp.webpagepreview.WebPagePreviewView r3 = r0.A05
            X.1VX r2 = r3.A0U
            X.2vE r1 = X.C58422vE.A01
            r0 = 3254(0xcb6, float:4.56E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0008
            android.view.ViewGroup r1 = r3.A07
            android.animation.LayoutTransition r0 = new android.animation.LayoutTransition
            r0.<init>()
            r1.setLayoutTransition(r0)
            return
        L_0x00a3:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.RegisterPhone r1 = (com.whatsapp.registration.RegisterPhone) r1
            boolean r0 = r1.A0e
            if (r0 != 0) goto L_0x0008
            android.widget.TextView r1 = r1.A09
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00b3:
            java.lang.Object r0 = r7.A00
            X.5qb r0 = (X.C116635qb) r0
            X.5UY r0 = r0.A0J
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x0008
        L_0x00bd:
            r0.clearAnimation()
            return
        L_0x00c1:
            java.lang.Object r6 = r7.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r6 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r6
            r6.A1V()
            android.view.ViewGroup r0 = r6.A02
            int r0 = r0.getHeight()
            r1 = 0
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r1, r1, r0, r1)
            r0 = 150(0x96, double:7.4E-322)
            r5.setDuration(r0)
            android.view.ViewGroup r0 = r6.A02
            r4 = 0
            r0.setVisibility(r4)
            android.view.View r0 = r6.A01
            r0.setVisibility(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            int r3 = r0.getSelectionStart()
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            int r2 = r0.getSelectionEnd()
            com.whatsapp.mentions.MentionableEntry r1 = r6.A0G
            java.lang.String r0 = r1.getStringText()
            r1.setText(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            r0.setSelection(r3, r2)
            r6.A0W = r4
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r6.A0F
            r0.startAnimation(r5)
            return
        L_0x0107:
            java.lang.Object r2 = r7.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A0F
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.A02
            r0.setVisibility(r1)
            android.view.View r0 = r2.A01
            r0.setVisibility(r1)
            r0 = 0
            r2.A0F = r0
            r2.A1V()
            r2.A1W()
            r0 = 0
            r2.A0T = r0
            return
        L_0x0129:
            java.lang.Object r0 = r7.A00
            X.6BJ r0 = (X.AnonymousClass6BJ) r0
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            r1 = 4
            X.5rT r0 = new X.5rT
            r0.<init>(r7, r1, r2)
            r2.post(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r7.A00
            X.0eF r0 = (X.C08310eF) r0
            X.0df r0 = r0.A0U()
            r0.A0N()
            return
        L_0x0147:
            java.lang.Object r2 = r7.A00
            X.563 r2 = (X.AnonymousClass563) r2
            android.view.ViewGroup r0 = r2.A0Z
            r0.clearAnimation()
            super.onAnimationEnd(r8)
            java.lang.Runnable r0 = r2.A14
            r2.removeCallbacks(r0)
            r0 = 0
            r2.A0M = r0
            boolean r0 = r2.A0N
            r1 = 8
            if (r0 == 0) goto L_0x0171
            android.view.ViewGroup r0 = r2.A0b
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.A0s
            r0.setVisibility(r1)
            android.widget.ImageButton r0 = r2.A0p
        L_0x016d:
            r0.setVisibility(r1)
            return
        L_0x0171:
            android.widget.ProgressBar r0 = r2.A0t
            goto L_0x016d
        L_0x0174:
            java.lang.Object r1 = r7.A00
            X.5qb r1 = (X.C116635qb) r1
            android.view.ViewGroup r0 = r1.A08
            r0.clearAnimation()
            android.view.View r1 = r1.A07
            r0 = 1
            r1.setFocusableInTouchMode(r0)
            r1.requestFocus()
            r0 = 0
            r1.setFocusableInTouchMode(r0)
            return
        L_0x018b:
            java.lang.Object r0 = r7.A00
            X.5qb r0 = (X.C116635qb) r0
            android.widget.ImageButton r1 = r0.A0D
            r0 = 1
            r1.setClickable(r0)
            goto L_0x01a0
        L_0x0196:
            java.lang.Object r0 = r7.A00
            X.5qb r0 = (X.C116635qb) r0
            android.view.ViewGroup r1 = r0.A0A
            r0 = 4
            r1.setVisibility(r0)
        L_0x01a0:
            r1.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1232467r.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        View view;
        switch (this.A01) {
            case 4:
                View view2 = ((C92224mI) this.A00).A00;
                C626936e.A04(view2);
                view2.setVisibility(0);
                return;
            case 11:
                view = ((C116635qb) this.A00).A0C;
                break;
            case 12:
                view = ((C116635qb) this.A00).A0D;
                break;
            case 13:
                view = ((C116635qb) this.A00).A08;
                break;
            case 15:
                return;
            case 16:
                ((C116635qb) this.A00).A0J.A06(0);
                return;
            case 18:
                super.onAnimationStart(animation);
                view = ((WebPagePreviewView) this.A00).A0E;
                break;
            default:
                super.onAnimationStart(animation);
                return;
        }
        view.setVisibility(0);
    }
}
