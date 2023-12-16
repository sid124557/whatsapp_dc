package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.5nh  reason: invalid class name and case insensitive filesystem */
public class C114845nh implements C1229866p {
    public final /* synthetic */ SearchViewModel A00;

    public C30471mV B9Y(int i) {
        if (i == -2) {
            return null;
        }
        SearchViewModel searchViewModel = this.A00;
        if (i < searchViewModel.A08.A01.size()) {
            return (C30471mV) searchViewModel.A08.A01.get(i);
        }
        return null;
    }

    public int BBZ(AnonymousClass2z0 r4) {
        int i = 0;
        while (true) {
            SearchViewModel searchViewModel = this.A00;
            if (i >= searchViewModel.A08.A01.size()) {
                return -2;
            }
            if (AnonymousClass75J.A00(r4, C18320x8.A0R(searchViewModel.A08.A01, i).A1J)) {
                return i;
            }
            i++;
        }
    }

    public C114845nh(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public void BWs() {
        this.A00.A0W(2);
    }

    public void Bm9(Runnable runnable) {
        this.A00.A0H = runnable;
    }

    public void Bpf() {
    }

    public void BqB() {
    }

    public void Brd(int i) {
        SearchViewModel searchViewModel = this.A00;
        int A0H = searchViewModel.A0H((C30471mV) searchViewModel.A08.A01.get(i));
        if (A0H >= 0 && A0H <= searchViewModel.A0L().size()) {
            C06270Wx.A04(searchViewModel.A1D, A0H);
        }
    }

    public void close() {
    }

    public int getCount() {
        return this.A00.A08.A01.size();
    }
}
