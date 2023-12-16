package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.92M  reason: invalid class name */
public class AnonymousClass92M implements C182008ni {
    public Object A00;
    public final int A01;

    public AnonymousClass92M(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass5ZO BCV() {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                return ((BusinessDirectoryContextualSearchViewModel) obj).A0E();
            case 1:
                return ((AnonymousClass4U8) obj).A05;
            default:
                return ((AnonymousClass4U5) obj).A0Q.A00.A01;
        }
    }
}
