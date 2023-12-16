package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.4lL  reason: invalid class name and case insensitive filesystem */
public class C91884lL extends C91924lo implements SectionIndexer {
    public List A00 = AnonymousClass001.A0s();
    public List A01 = AnonymousClass001.A0s();

    public int getPositionForSection(int i) {
        List list = this.A00;
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return AnonymousClass000.A09(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        List list2 = this.A01;
        List list3 = this.A00;
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return AnonymousClass002.A03(list2);
        }
        int size = list3.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
        } while (AnonymousClass000.A09(list3, size) > i);
        return size;
    }

    public Object[] getSections() {
        return this.A01.toArray(new String[1]);
    }

    public C91884lL(WfalManager wfalManager, ContactPickerFragment contactPickerFragment, C56612sH r4, AnonymousClass1VX r5, C49882hF r6, C50282hv r7, C56072rN r8, C104745Se r9, C183538qC r10, C183538qC r11) {
        super(wfalManager, contactPickerFragment, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = C100265Af.A00(this.A05.A1V, this.A02);
        this.A01 = (List) A002.first;
        this.A00 = (List) A002.second;
    }
}
