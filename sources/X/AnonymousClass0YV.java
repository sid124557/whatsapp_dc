package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0YV  reason: invalid class name */
public final class AnonymousClass0YV {
    public static String A01(int i) {
        if (i == 0) {
            return "success";
        }
        if (i == 1) {
            return "service-missing";
        }
        if (i == 2) {
            return "service-version-update-required";
        }
        if (i == 3) {
            return "service-disabled";
        }
        if (i == 9) {
            return "service-invalid";
        }
        if (i != 18) {
            return AnonymousClass000.A0Y("unexpected-return-code: ", AnonymousClass001.A0o(), i);
        }
        return "service-updating";
    }

    public static String A03(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "daily";
        }
        if (i == 2) {
            return "weekly";
        }
        if (i == 3) {
            return "monthly";
        }
        if (i == 4) {
            return "manual";
        }
        throw AnonymousClass000.A0G("Unexpected backup frequency: ", AnonymousClass001.A0o(), i);
    }

    public static String A04(Context context, C55682qk r2, AnonymousClass310 r3, String str) {
        if (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) {
            return A05(context, r2, str);
        }
        return A09(r3, str);
    }

    public static String A05(Context context, C55682qk r6, String str) {
        String replace;
        if ("_INTERNAL_DATABASES_/chatsettings.db".equals(str)) {
            Log.i(AnonymousClass000.A0V("gdrive-util/convert-upload-title-to-local-path/ignored-file-skipped-from-backup ", str, AnonymousClass001.A0o()));
        } else {
            try {
                if (str.startsWith("_INTERNAL_FILES_")) {
                    replace = str.replace("_INTERNAL_FILES_", context.getFilesDir().getAbsolutePath());
                } else if (str.startsWith("_INTERNAL_DATABASES_")) {
                    File parentFile = context.getDatabasePath("dummy.db").getParentFile();
                    if (parentFile != null) {
                        replace = str.replace("_INTERNAL_DATABASES_", parentFile.getAbsolutePath());
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("gdrive-util/upload-title-to-local-path/unexpected-title: ");
                    throw AnonymousClass000.A0F(str, A0o);
                }
                String canonicalPath = AnonymousClass002.A0B(replace).getCanonicalPath();
                Set<File> A0D = A0D(context);
                HashSet hashSet = new HashSet(A0D.size());
                for (File canonicalPath2 : A0D) {
                    hashSet.add(AnonymousClass002.A0B(canonicalPath2.getCanonicalPath()));
                }
                if (hashSet.contains(AnonymousClass002.A0B(canonicalPath))) {
                    return canonicalPath;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("gdrive-util/convert-upload-title-to-local-path/local-path-unexpected/return-null ");
                A0o2.append(canonicalPath);
                A0o2.append(" not in [");
                Log.e(AnonymousClass000.A0W(TextUtils.join(" ", hashSet), A0o2));
                r6.A0A("gdrive-util/convert-upload-title-to-local-path", true, "gdrive: upload title maps to invalid local path");
                return null;
            } catch (IOException e) {
                Log.e("gdrive-util/upload-title-to-local-path", e);
                return null;
            }
        }
        return null;
    }

    public static String A08(AnonymousClass310 r2, AnonymousClass5ZR r3, File file, long j) {
        try {
            try {
                return C627536m.A07(file, MessageDigest.getInstance("MD5"), j);
            } catch (IOException e) {
                if (!r2.A0C(file) || !r3.A0H()) {
                    Log.e("gdrive-util/get-message-digest", e);
                    return null;
                }
                throw new AnonymousClass0EV(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String A0A(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 1) {
            return str;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(str.charAt(0));
        A0o.append("***");
        return AnonymousClass000.A0X(str.substring(indexOf - 1), A0o);
    }

    public static int A00(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 6;
            case 12:
                return 15;
            case 13:
                return 3;
            case 14:
                return 5;
            case 15:
                return 8;
            case 16:
                return 9;
            case 17:
                return 10;
            case 18:
                return 11;
            case 19:
                return 12;
            case 20:
                return 13;
            case 21:
                return 14;
            case 23:
                return 16;
            case 24:
                return 18;
            case 25:
                return 17;
            case 27:
                return 25;
            case 28:
                return 26;
            case 29:
                return 27;
            case 30:
                return 28;
            case 31:
                return 29;
            default:
                return 2;
        }
    }

    public static String A02(int i) {
        switch (i) {
            case 10:
                return "none";
            case 11:
                return "auth-failed";
            case 12:
                return "account-missing";
            case 13:
                return "google-drive-full";
            case 14:
                return "google-drive-not-reachable";
            case 15:
                return "local-storage-full";
            case 16:
                return "local-chat-backup-missing";
            case 17:
                return "file-not-found";
            case 18:
                return "base-folder-does-not-exist";
            case 19:
                return "gdrive-servers-are-not-working-properly";
            case 20:
                return "failed-to-authenticate-with-whatsapp-servers";
            case 21:
                return "gps-unavailable";
            case 22:
                return "local-gdrive-file-map-is-missing";
            case 23:
                return "read-external-storage-permission-is-missing";
            case 24:
                return "backup-generated-using-newer-version-of-app";
            case 25:
                return "service-disabled";
            case 26:
                return "unknown";
            case 27:
                return "media-without-message-from-db";
            case 28:
                return "auth-failed-user-recoverable";
            case 29:
                return "auth-failed-user-recoverable-notified";
            case 30:
                return "auth-failed-user-security-exception";
            case 31:
                return "auth-failed-user-lib-exception";
            default:
                return AnonymousClass000.A0Y("unexpected-error-code:", AnonymousClass001.A0o(), i);
        }
    }

    public static String A06(Context context, AnonymousClass310 r12, File file) {
        String str;
        String absolutePath = file.getAbsolutePath();
        if (r12.A0C(file)) {
            str = r12.A09(absolutePath);
            if (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) {
                Log.e(AnonymousClass000.A0V("gdrive-util/local-path-to-upload-title/malicious-file-name: ", str, AnonymousClass001.A0o()));
            }
            return str;
        }
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath2)) {
            str = absolutePath.replace(absolutePath2, "_INTERNAL_FILES_");
        } else {
            File parentFile = context.getDatabasePath("dummy.db").getParentFile();
            if (parentFile != null) {
                String absolutePath3 = parentFile.getAbsolutePath();
                if (absolutePath.startsWith(absolutePath3)) {
                    str = absolutePath.replace(absolutePath3, "_INTERNAL_DATABASES_");
                } else {
                    Log.w(AnonymousClass000.A0V("gdrive-util/unexpected file: ", absolutePath, AnonymousClass001.A0o()));
                    return null;
                }
            }
        }
        String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", new Object[]{absolutePath, str});
        return str;
        return null;
    }

    public static String A07(AnonymousClass310 r2, AnonymousClass5ZR r3, File file) {
        return A08(r2, r3, file, file.length());
    }

    public static String A09(AnonymousClass310 r0, String str) {
        return r0.A07(str).getAbsolutePath();
    }

    public static String A0B(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(A0A(str2));
        return sb.toString();
    }

    public static String A0C(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(A02(i));
        return sb.toString();
    }

    public static Set A0D(Context context) {
        HashSet A0K = AnonymousClass002.A0K();
        A0K.add(context.getDatabasePath("chatsettingsbackup.db"));
        A0K.add(AnonymousClass002.A0A(context.getFilesDir(), "wallpaper.jpg"));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-util/get-internal-files-for-restore [");
        Log.i(AnonymousClass000.A0W(TextUtils.join(", ", A0K), A0o));
        return A0K;
    }

    public static void A0E(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(A0A(str2));
    }

    public static boolean A0F(Context context) {
        int A00 = C159787mS.A00(context);
        if (A00 == 0) {
            return true;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CoreGoogleDriveUtilsisGoogleDriveAccessPossible/Google Play services are missing and can be installed,  status code: ");
            Log.i(AnonymousClass000.A0X(A01(A00), A0o));
            return true;
        } catch (Exception e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("CoreGoogleDriveUtilsisGoogleDriveAccessPossible/Google Play services are missing and cannot be installed, status code: ");
            Log.i(AnonymousClass000.A0X(A01(A00), A0o2), e);
            return false;
        }
    }
}
