package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5e8  reason: invalid class name and case insensitive filesystem */
public class C109135e8 implements TextWatcher {
    public int A00;
    public boolean A01;
    public AnonymousClass6EE[] A02;
    public final /* synthetic */ MentionableEntry A03;

    public C109135e8(MentionableEntry mentionableEntry) {
        this.A03 = mentionableEntry;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A00 > 0) {
            MentionableEntry mentionableEntry = this.A03;
            AnonymousClass6EE[] r7 = this.A02;
            int i = 0;
            if (this.A01) {
                int length = r7.length;
                while (i < length) {
                    AnonymousClass6EE r3 = r7[i];
                    int spanStart = editable.getSpanStart(r3.A00);
                    int spanEnd = editable.getSpanEnd(r3);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        mentionableEntry.A0G(r3.A00);
                        mentionableEntry.A0G(r3);
                        editable.delete(spanStart, spanEnd);
                    }
                    i++;
                }
            } else {
                AnonymousClass6EE[] r32 = (AnonymousClass6EE[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), AnonymousClass6EE.class);
                mentionableEntry.A0G(mentionableEntry.A0E);
                mentionableEntry.A0E = null;
                int length2 = r32.length;
                while (i < length2) {
                    AnonymousClass6EE r1 = r32[i];
                    mentionableEntry.A0G(r1.A00);
                    mentionableEntry.A0G(r1);
                    i++;
                }
            }
        }
        this.A03.A0D(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionableEntry mentionableEntry = this.A03;
        int selectionEnd = mentionableEntry.getSelectionEnd();
        this.A02 = (AnonymousClass6EE[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, AnonymousClass6EE.class);
        this.A01 = AnonymousClass000.A1U(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i2;
    }
}
