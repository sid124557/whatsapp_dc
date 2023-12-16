package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.6HL  reason: invalid class name */
public class AnonymousClass6HL extends AnonymousClass0OM {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ AnonymousClass6Hm A01;
    public final /* synthetic */ ShapePickerRecyclerView A02;

    public AnonymousClass6HL(GridLayoutManager gridLayoutManager, AnonymousClass6Hm r2, ShapePickerRecyclerView shapePickerRecyclerView) {
        this.A02 = shapePickerRecyclerView;
        this.A01 = r2;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i) {
        if (this.A01.A0K(i).A00 != 0) {
            return this.A00.A00;
        }
        return this.A02.A01;
    }
}
