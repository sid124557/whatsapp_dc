package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.69b  reason: invalid class name and case insensitive filesystem */
public class C1236069b implements C182728ot {
    public Object A00;
    public final int A01;

    public C1236069b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BOd(boolean z) {
        if (this.A01 != 0) {
            View view = (View) this.A00;
            int i = R.drawable.ib_new_expanded;
            if (z) {
                i = R.drawable.ib_new_expanded_bottom;
            }
            view.setBackgroundResource(i);
            return;
        }
        EditMessageActivity editMessageActivity = (EditMessageActivity) this.A00;
        if (!z) {
            AnonymousClass4UY r2 = editMessageActivity.A0A;
            MentionableEntry mentionableEntry = editMessageActivity.A0I;
            C162457s7.A0J(mentionableEntry, 0);
            r2.A00 = mentionableEntry.getStringText();
            r2.A01 = mentionableEntry.getMentions();
        }
        editMessageActivity.A76();
    }
}
