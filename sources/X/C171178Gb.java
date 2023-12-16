package X;

import android.database.ContentObserver;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8Gb  reason: invalid class name and case insensitive filesystem */
public final class C171178Gb implements C186308v5 {
    public final C186308v5 A00;
    public final List A01;
    public final /* synthetic */ C171198Gd A02;

    public C171178Gb(C171198Gd r1, C186308v5 r2, List list) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = list;
    }

    public HashMap B4t() {
        return this.A00.B4t();
    }

    public C186058ug B9S(int i) {
        List list = this.A01;
        if (i < list.size()) {
            return (C186058ug) list.get(i);
        }
        return this.A00.B9S(i - list.size());
    }

    public C186058ug Bhe(int i) {
        List list = this.A01;
        if (i >= list.size()) {
            return this.A00.Bhe(i - list.size());
        }
        return (C186058ug) list.get(i);
    }

    public void Bjj() {
        this.A00.Bjj();
    }

    public void close() {
        this.A00.close();
    }

    public int getCount() {
        return this.A00.getCount() + this.A01.size();
    }

    public boolean isEmpty() {
        if (!this.A00.isEmpty() || !this.A01.isEmpty()) {
            return false;
        }
        return true;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.A00.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.A00.unregisterContentObserver(contentObserver);
    }
}
