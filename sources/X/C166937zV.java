package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.conversation.ConversationEntryActionButton;

/* renamed from: X.7zV  reason: invalid class name and case insensitive filesystem */
public class C166937zV implements View.OnTouchListener, View.OnLongClickListener {
    public PointF A00 = null;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03 = new Handler();
    public final /* synthetic */ View.OnTouchListener A04;
    public final /* synthetic */ ConversationEntryActionButton A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ Runnable A07;

    public C166937zV(View.OnTouchListener onTouchListener, ConversationEntryActionButton conversationEntryActionButton, Runnable runnable, Runnable runnable2) {
        this.A05 = conversationEntryActionButton;
        this.A06 = runnable;
        this.A04 = onTouchListener;
        this.A07 = runnable2;
    }

    public final boolean A00() {
        if (!this.A01) {
            return false;
        }
        AnonymousClass4VH r0 = this.A05.A03;
        if (r0 != null) {
            r0.A0H(false);
        }
        this.A00 = null;
        this.A01 = false;
        this.A02 = false;
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A07.run();
        return true;
    }

    public boolean onLongClick(View view) {
        return A00();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        PointF pointF = null;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        AnonymousClass4VH r0 = this.A05.A03;
                        if (r0 != null) {
                            r0.A0H(false);
                        }
                    }
                } else if (this.A00 != null) {
                    ConversationEntryActionButton conversationEntryActionButton = this.A05;
                    if (conversationEntryActionButton.A0B != null) {
                        if (AnonymousClass6C8.A00(motionEvent.getY(), this.A00.y, motionEvent.getX() - this.A00.x) > ((float) conversationEntryActionButton.A0B.intValue())) {
                            A00();
                        }
                    }
                }
            } else if (this.A02) {
                this.A02 = false;
                this.A06.run();
            }
            this.A03.removeCallbacksAndMessages((Object) null);
        } else {
            ConversationEntryActionButton conversationEntryActionButton2 = this.A05;
            AnonymousClass5TN r1 = conversationEntryActionButton2.A03.A01;
            if (!r1.A06 && !r1.A0B) {
                z = true;
            }
            this.A01 = true;
            if (!z && conversationEntryActionButton2.A0B != null) {
                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            this.A00 = pointF;
            if (z) {
                A00();
            }
            this.A02 = true;
            this.A03.postDelayed(new C71703cX(25, (Object) this, z), conversationEntryActionButton2.getShortTapTimeoutMs());
        }
        return this.A04.onTouch(view, motionEvent);
    }
}
