package X;

import androidx.appcompat.widget.SearchView;

/* renamed from: X.0iX  reason: invalid class name and case insensitive filesystem */
public class C10800iX implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete A00;

    public C10800iX(SearchView.SearchAutoComplete searchAutoComplete) {
        this.A00 = searchAutoComplete;
    }

    public void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.A00;
        if (searchAutoComplete.A02) {
            AnonymousClass000.A0C(searchAutoComplete).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.A02 = false;
        }
    }
}
