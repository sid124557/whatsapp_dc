package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;

/* renamed from: X.6lp  reason: invalid class name and case insensitive filesystem */
public final class C136086lp extends C136186lz {
    public final BusinessDirectoryConsumerHomeViewModel A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136086lp) && C162457s7.A0P(this.A00, ((C136086lp) obj).A00));
    }

    public C136086lp(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        super(30);
        this.A00 = businessDirectoryConsumerHomeViewModel;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
