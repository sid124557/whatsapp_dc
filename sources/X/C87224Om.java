package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.4Om  reason: invalid class name and case insensitive filesystem */
public class C87224Om extends CursorAdapter {
    public final C89654ea A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87224Om(C89654ea r3, AudioPickerActivity audioPickerActivity) {
        super(r3, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = r3;
    }

    public final C102885Kq A00(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C102885Kq(this.A01, cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(0), cursor.getInt(4), cursor.getInt(5));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        new AnonymousClass5UB(view, this.A01, cursor.getPosition()).A03(this.A00, A00(cursor));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
    }
}
