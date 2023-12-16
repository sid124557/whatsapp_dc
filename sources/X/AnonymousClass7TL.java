package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import java.util.List;

/* renamed from: X.7TL  reason: invalid class name */
public final class AnonymousClass7TL {
    public int A00;
    public Movie A01;
    public C172258Kh A02;
    public List A03;

    public C172258Kh A00() {
        int i;
        Movie movie = this.A01;
        List list = this.A03;
        if (movie == null || list == null || list.size() <= (i = this.A00)) {
            return null;
        }
        C149287Lw r0 = (C149287Lw) list.get(i);
        Bitmap A0Y = C86664Kz.A0Y(r0.A03, r0.A01);
        C162457s7.A0D(A0Y);
        Canvas canvas = new Canvas(A0Y);
        A0Y.eraseColor(0);
        movie.draw(canvas, 0.0f, 0.0f);
        return new C172258Kh(C172258Kh.A04, (C180368kv) new AnonymousClass93M(1), (Object) A0Y);
    }
}
