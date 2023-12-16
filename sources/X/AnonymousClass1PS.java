package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.1PS  reason: invalid class name */
public class AnonymousClass1PS extends AnonymousClass1PT {
    public C114015mM A00;
    public boolean A01;
    public final ImageView A02;
    public final ImageView A03 = AnonymousClass0x9.A0F(this, R.id.photo_new);
    public final ImageView A04 = AnonymousClass0x9.A0F(this, R.id.photo_old);

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A25();
        }
    }

    public final void A25() {
        ProfilePhotoChange profilePhotoChange;
        byte[] bArr;
        ImageView imageView;
        ImageView imageView2;
        C30341mI r2 = (C30341mI) this.A0S;
        AnonymousClass2z0 r6 = r2.A1J;
        if (!(!r6.A02 || r2.A00 != 6 || (profilePhotoChange = ((C31331o7) r2).A00) == null || (bArr = profilePhotoChange.newPhoto) == null || profilePhotoChange.oldPhoto == null)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            byte[] bArr2 = profilePhotoChange.oldPhoto;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            if (!(decodeByteArray == null || decodeByteArray2 == null)) {
                if (this.A0L.A06(AnonymousClass34R.A01(r6.A00))) {
                    Bitmap A002 = C114015mM.A00(decodeByteArray2, -2.14748365E9f, decodeByteArray2.getWidth());
                    Bitmap A003 = C114015mM.A00(decodeByteArray, -2.14748365E9f, decodeByteArray.getWidth());
                    imageView = this.A04;
                    imageView.setImageBitmap(A002);
                    imageView2 = this.A03;
                    imageView2.setImageBitmap(A003);
                } else {
                    AnonymousClass01B r22 = new AnonymousClass01B(C18290x4.A0G(this), decodeByteArray2);
                    AnonymousClass01B r0 = new AnonymousClass01B(C18290x4.A0G(this), decodeByteArray);
                    r22.A00();
                    r0.A00();
                    imageView = this.A04;
                    imageView.setImageDrawable(r22);
                    imageView2 = this.A03;
                    imageView2.setImageDrawable(r0);
                }
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                this.A02.setVisibility(0);
                return;
            }
        }
        this.A04.setVisibility(8);
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
    }

    public AnonymousClass1PS(Context context, AnonymousClass677 r5, C30341mI r6) {
        super(context, r5, r6);
        A0v();
        ImageView A0F = AnonymousClass0x9.A0F(this, R.id.arrow);
        this.A02 = A0F;
        C18270x1.A0d(context, A0F, this.A0M, R.drawable.ic_chat_icon_change_arrow);
        A25();
    }

    public void A1H() {
        A25();
        super.A1H();
    }

    public int getBackgroundResource() {
        return 0;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
