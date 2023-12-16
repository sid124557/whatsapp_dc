package X;

import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.5fY  reason: invalid class name and case insensitive filesystem */
public class C110015fY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ GroupProfileEmojiEditor A04;

    public C110015fY(GroupProfileEmojiEditor groupProfileEmojiEditor, int i, int i2, int i3, int i4) {
        this.A04 = groupProfileEmojiEditor;
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
    }

    public void onGlobalLayout() {
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        int A0L;
        int min;
        GroupProfileEmojiEditor groupProfileEmojiEditor = this.A04;
        C86604Kt.A1G(groupProfileEmojiEditor.A02, this);
        int height = groupProfileEmojiEditor.A02.getHeight();
        int i2 = ((height - this.A02) - this.A00) - (this.A03 * 3);
        int i3 = height / 2;
        BottomSheetBehavior bottomSheetBehavior2 = groupProfileEmojiEditor.A06;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0F = Math.max(i3, i2);
            int i4 = this.A01;
            if (i2 < i4) {
                min = Math.max(i2, i3);
            } else {
                min = Math.min(i4, i3);
            }
            bottomSheetBehavior2.A0U(min, false);
        }
        if (groupProfileEmojiEditor.A01 != null && groupProfileEmojiEditor.A02 != null && (bottomSheetBehavior = groupProfileEmojiEditor.A06) != null && (i = bottomSheetBehavior.A0O) != 5) {
            if (i == 3) {
                A0L = bottomSheetBehavior.A0F;
            } else {
                A0L = bottomSheetBehavior.A0L();
            }
            groupProfileEmojiEditor.A75(A0L);
        }
    }
}
