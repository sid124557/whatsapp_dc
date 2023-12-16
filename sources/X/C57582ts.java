package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.2ts  reason: invalid class name and case insensitive filesystem */
public class C57582ts {
    public static void A00(WebpUtils webpUtils, File file, Boolean bool, String str) {
        long j;
        WebpInfo A02 = webpUtils.A02(file.getAbsolutePath());
        int length = (int) (file.length() / 1024);
        if (A02 == null) {
            throw new C32651rO(AnonymousClass000.A0V("sticker file might be corrupted or invalid, sticker: ", str, AnonymousClass001.A0o()));
        } else if (A02.height != 512) {
            throw new C32651rO(AnonymousClass000.A0V("sticker height should be 512, sticker: ", str, AnonymousClass001.A0o()));
        } else if (A02.width == 512) {
            int i = A02.numFrames;
            if (i > 1) {
                if (bool != null && !bool.booleanValue()) {
                    throw new C32651rO(AnonymousClass000.A0V("pack is not marked as animated pack but contains animated stickers. sticker: ", str, AnonymousClass001.A0o()));
                } else if (A02.minFrameDurationMS < 8) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("frame duration for any frame should exceed ");
                    A0o.append(8);
                    throw new C32651rO(AnonymousClass000.A0V(" ms. sticker: ", str, A0o));
                } else if (A02.totalAnimationDurationMS > ((long) SearchActionVerificationClientService.NOTIFICATION_ID)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("total animation duration should be under ");
                    A0o2.append(SearchActionVerificationClientService.NOTIFICATION_ID);
                    throw new C32651rO(AnonymousClass000.A0V(" ms. sticker: ", str, A0o2));
                }
            } else if (bool != null && bool.booleanValue()) {
                throw new C32651rO(AnonymousClass000.A0V("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ", str, AnonymousClass001.A0o()));
            }
            long j2 = (long) length;
            if (i > 1) {
                j = (long) 500;
            } else {
                j = 100;
            }
            if (j2 > j) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("sticker file should be less than ");
                A0o3.append(j);
                throw new C32651rO(AnonymousClass000.A0V(" kB, file: ", str, A0o3));
            }
        } else {
            throw new C32651rO(AnonymousClass000.A0V("sticker width should be  512, sticker: ", str, AnonymousClass001.A0o()));
        }
    }

    public static boolean A01(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("https://");
        A0o.append(str2);
        if (str.startsWith(AnonymousClass000.A0X("/", A0o)) || str.startsWith(AnonymousClass000.A0U("http://", str2, "/", AnonymousClass001.A0o()))) {
            return true;
        }
        return false;
    }
}
