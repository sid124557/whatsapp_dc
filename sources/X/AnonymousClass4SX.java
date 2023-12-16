package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaRoundCornerImageView;
import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.components.button.ThumbnailPickerButton;
import com.whatsapp.conversation.comments.CommentFailedIconView;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.status.ScalingContactStatusThumbnail;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4SX  reason: invalid class name */
public abstract class AnonymousClass4SX extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A02(AddScreenshotImageView addScreenshotImageView) {
        addScreenshotImageView.A0E = new RectF();
        addScreenshotImageView.A0F = new RectF();
        addScreenshotImageView.A0A = new Paint(1);
        addScreenshotImageView.A0B = new Paint(1);
        addScreenshotImageView.A0C = new Paint(1);
        addScreenshotImageView.A0D = new Paint(1);
        addScreenshotImageView.A09 = new Matrix();
        addScreenshotImageView.A08();
        addScreenshotImageView.A07();
    }

    public void A05() {
        if (this instanceof StickerView) {
            StickerView stickerView = (StickerView) this;
            if (!stickerView.A02) {
                stickerView.A02 = true;
                A01(stickerView);
            }
        } else if (this instanceof MessageThumbView) {
            MessageThumbView messageThumbView = (MessageThumbView) this;
            if (!messageThumbView.A03) {
                messageThumbView.A03 = true;
                C64333Db A002 = C88864av.A00(messageThumbView.generatedComponent());
                messageThumbView.A00 = C64333Db.A2t(A002);
                messageThumbView.A02 = C86654Ky.A0e(A002);
            }
        } else if (this instanceof AddScreenshotImageView) {
            AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) this;
            if (!addScreenshotImageView.A0G) {
                addScreenshotImageView.A0G = true;
                A01(addScreenshotImageView);
            }
        } else if (this instanceof CommentFailedIconView) {
            CommentFailedIconView commentFailedIconView = (CommentFailedIconView) this;
            if (!commentFailedIconView.A0B) {
                commentFailedIconView.A0B = true;
                C64333Db A003 = C88864av.A00(commentFailedIconView.generatedComponent());
                commentFailedIconView.A00 = C64333Db.A2t(A003);
                commentFailedIconView.A05 = C64333Db.A2p(A003);
                commentFailedIconView.A08 = C64333Db.A4B(A003);
                commentFailedIconView.A00 = C64333Db.A04(A003);
                commentFailedIconView.A01 = C64333Db.A06(A003);
                commentFailedIconView.A02 = C86644Kx.A0L(A003);
                commentFailedIconView.A0A = C64333Db.A8y(A003);
                commentFailedIconView.A03 = C64333Db.A08(A003);
                commentFailedIconView.A04 = C86654Ky.A0T(A003);
                commentFailedIconView.A06 = C86614Ku.A0Z(A003);
                commentFailedIconView.A09 = (C52552lf) A003.AHS.get();
                commentFailedIconView.A07 = (C620333f) A003.AKQ.get();
            }
        } else if (this instanceof C89804ex) {
            C89804ex r1 = (C89804ex) this;
            if (r1 instanceof C91814l8) {
                C91814l8 r12 = (C91814l8) r1;
                if (r12 instanceof ScalingContactStatusThumbnail) {
                    ScalingContactStatusThumbnail scalingContactStatusThumbnail = (ScalingContactStatusThumbnail) r12;
                    if (!scalingContactStatusThumbnail.A00) {
                        scalingContactStatusThumbnail.A00 = true;
                        A01(scalingContactStatusThumbnail);
                    }
                } else if (!r12.A00) {
                    r12.A00 = true;
                    A01(r12);
                }
            } else if (r1 instanceof ContactLiveLocationThumbnail) {
                ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) r1;
                if (!contactLiveLocationThumbnail.A04) {
                    contactLiveLocationThumbnail.A04 = true;
                    A01(contactLiveLocationThumbnail);
                }
            } else if (r1 instanceof ThumbnailPickerButton) {
                ThumbnailPickerButton thumbnailPickerButton = (ThumbnailPickerButton) r1;
                if (!thumbnailPickerButton.A01) {
                    thumbnailPickerButton.A01 = true;
                    A01(thumbnailPickerButton);
                }
            } else if (r1 instanceof C91804l7) {
                C91804l7 r13 = (C91804l7) r1;
                if (!r13.A00) {
                    r13.A00 = true;
                    A01(r13);
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                A01(r1);
            }
        } else if (this instanceof C89774eu) {
            C89774eu r4 = (C89774eu) this;
            if (!r4.A00) {
                r4.A00 = true;
                AvailabilityStateImageView availabilityStateImageView = (AvailabilityStateImageView) r4;
                C88864av r3 = (C88864av) ((C111685iW) r4.generatedComponent());
                C64333Db r14 = r3.A0K;
                availabilityStateImageView.A00 = C64333Db.A2t(r14);
                availabilityStateImageView.A07(new AnonymousClass4Lq((C102785Kg) r3.A01.get()), (C59862xc) r14.APF.get());
            }
        } else if (this instanceof WaRoundCornerImageView) {
            WaRoundCornerImageView waRoundCornerImageView = (WaRoundCornerImageView) this;
            if (!waRoundCornerImageView.A03) {
                waRoundCornerImageView.A03 = true;
                A01(waRoundCornerImageView);
            }
        } else if (this instanceof WaNetworkResourceImageView) {
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) this;
            if (!waNetworkResourceImageView.A02) {
                waNetworkResourceImageView.A02 = true;
                C64333Db A004 = C88864av.A00(waNetworkResourceImageView.generatedComponent());
                waNetworkResourceImageView.A00 = C64333Db.A2t(A004);
                waNetworkResourceImageView.A01 = (C103695Nz) A004.A00.A7t.get();
            }
        } else if (this instanceof C89794ew) {
            C89794ew r15 = (C89794ew) this;
            if (!r15.A00) {
                r15.A00 = true;
                A01(r15);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((WaImageView) this).A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4SX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public static void A00(View view, ThumbnailButton thumbnailButton) {
        thumbnailButton.A02 = view.getResources().getDimension(R.dimen.f6nameremoved);
    }

    public static void A01(WaImageView waImageView) {
        waImageView.A00 = (C620733j) ((C88864av) ((C111685iW) waImageView.generatedComponent())).A0K.AbU.get();
    }

    public AnonymousClass4SX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public AnonymousClass4SX(Context context) {
        super(context, (AttributeSet) null);
        A05();
    }
}
