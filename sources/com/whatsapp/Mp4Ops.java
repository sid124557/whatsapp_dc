package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6z0;
import X.C107655bf;
import X.C134206ic;
import X.C153407bG;
import X.C162397rz;
import X.C18260x0;
import X.C18290x4;
import X.C22121Ep;
import X.C55682qk;
import X.C56512s6;
import X.C626936e;
import X.C627536m;
import X.C73173f3;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Mp4Ops {
    public final C56512s6 A00;

    public static void A00(Context context, C55682qk r7, C153407bG r8, File file, Exception exc, String str) {
        boolean z;
        C55682qk r5 = r7;
        File A0S = AnonymousClass6C7.A0S("/WhatsApp/Media/WhatsApp Video/video.fos", AnonymousClass000.A0l(context.getCacheDir().getPath()));
        C134206ic A04 = r8.A04(file, C18290x4.A0d(), false);
        try {
            z = mp4forensic(400, A0S.getAbsolutePath(), file.getAbsolutePath());
            Log.e(AnonymousClass000.A0b("mp4ops/forensic ret=", AnonymousClass001.A0o(), z));
        } catch (Error e) {
            Log.e("videotranscodder/forensic fail/", e);
            z = false;
        }
        C18260x0.A1E("mp4ops/forensic-upload/create result=", AnonymousClass001.A0o(), z);
        if (A04 != null) {
            C134206ic.A01(A04);
            long j = 0;
            if (!z) {
                j = 570;
            }
            A04.A0D = Long.valueOf(j);
            A04.A0C = AnonymousClass6C9.A0Z(A0S);
            r8.A02.BhD(A04);
        }
        if (z) {
            try {
                String name = A0S.getName();
                if (TextUtils.isEmpty(name)) {
                    name = "source";
                }
                File A05 = C627536m.A05(A0S, context.getFilesDir(), name);
                Log.e("Mp4Ops/uploadMp4FailureLogs", exc);
                HashMap A0t = AnonymousClass001.A0t();
                if (A05 != null) {
                    A0t.put("attachment", A05.getPath());
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LibMp4Operations ");
                A0o.append(str);
                ((C22121Ep) r5).A0E(new C73173f3("Mp4Ops/uploadMp4FailureLogs"), "Mp4Ops/uploadMp4FailureLogs", AnonymousClass000.A0a(" failed (file): ", A0o, exc), A0t, true);
            } catch (IOException e2) {
                Log.e("mp4ops/forensic-upload/", e2);
            }
        }
        A0S.delete();
    }

    public static void A02(C153407bG r14, File file, File file2) {
        Throwable r1;
        C153407bG r6 = r14;
        C134206ic A02 = r14.A02(file, file);
        try {
            Log.i("mp4ops/removeExifData/start");
            File file3 = file2;
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file3.getAbsolutePath(), -1.0f, 0.0f, -1.0f, -1.0f, -1, file.getAbsolutePath(), 0.0f);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mp4ops/removeExifData/finished success=");
            C18260x0.A1V(A0o, mp4mux.success);
            C153407bG.A00(mp4mux, r6, A02, file3);
            if (!mp4mux.success) {
                if (mp4mux.ioException) {
                    r1 = AnonymousClass002.A0C("mp4ops/removeExifData/No space");
                } else {
                    int i = mp4mux.errorCode;
                    r1 = new AnonymousClass6z0(i, AnonymousClass000.A0Y("mp4ops/removeExifData failed, error_code: ", AnonymousClass001.A0o(), i));
                }
                throw r1;
            }
        } catch (Error e) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e);
            throw new AnonymousClass6z0(0, e.getMessage());
        }
    }

    public static native int getMp4opsImpl();

    public static native LibMp4OperationResult mp4check(String str, boolean z);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native boolean mp4forensic(int i, String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, float f2, float f3, float f4, int i, String str4, float f5);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z, long j);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public class AudioStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int mpegAudioObjectType;
        public final int mpegAudioToolsPresent;
        public final int numChannels;
        public final int samplingRate;
        public final int subType;
        public final int trackId;
        public final int type;

        public AudioStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
            this.trackId = i;
            this.type = i2;
            this.subType = i3;
            this.mpegAudioObjectType = i4;
            this.mpegAudioToolsPresent = i5;
            this.numChannels = i6;
            this.samplingRate = i7;
            this.averageBitrateKbps = i8;
            this.durationMs = j;
        }
    }

    public class LibMp4CheckAndRepairResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, boolean z3, int i, String str, boolean z4, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, long j, long j2, long j3, int i2, long j4, long j5, long j6, int i3) {
            this.success = z;
            this.repaired = z2;
            this.repairRequired = z3;
            this.errorCode = i;
            this.errorMessage = str;
            this.ioException = z4;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.oldMajorVersion = j;
            this.oldMinorVersion = j2;
            this.oldReleaseVersion = j3;
            this.oldOriginator = i2;
            this.newMajorVersion = j4;
            this.newMinorVersion = j5;
            this.newReleaseVersion = j6;
            this.newOriginator = i3;
        }
    }

    public class LibMp4OperationResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4OperationResult(boolean z, boolean z2, int i, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.errorMessage = str;
        }
    }

    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z, boolean z2, int i, String str, long j) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j;
        }
    }

    public class VideoStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int framesPerKseconds;
        public final int height;
        public final int levelIdc;
        public final int profileIdc;
        public final int rotationDegrees;
        public final int trackId;
        public final int type;
        public final int width;

        public VideoStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j) {
            this.trackId = i;
            this.type = i2;
            this.profileIdc = i3;
            this.levelIdc = i4;
            this.rotationDegrees = i5;
            this.width = i6;
            this.height = i7;
            this.framesPerKseconds = i8;
            this.averageBitrateKbps = i9;
            this.durationMs = j;
        }
    }

    public static void A01(C55682qk r7, C153407bG r8, C56512s6 r9, File file) {
        AnonymousClass6z0 r0;
        try {
            if (C162397rz.A06(r7, file).A00 == 0) {
                Log.d("mp4ops/remove-audio-tracks no audio tracks found");
                return;
            }
            File A03 = r9.A03(file);
            C134206ic A032 = r8.A03(file, A03);
            LibMp4OperationResult removeAudioTracks = removeAudioTracks(file.getAbsolutePath(), A03.getAbsolutePath());
            C153407bG.A00(removeAudioTracks, r8, A032, A03);
            if (!removeAudioTracks.success) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("mp4ops/remove-audio-tracks");
                C18260x0.A1K(A0o, removeAudioTracks.errorMessage);
                int i = removeAudioTracks.errorCode;
                r0 = new AnonymousClass6z0(i, AnonymousClass000.A0Y("invalid result, error_code: ", AnonymousClass001.A0o(), i));
            } else if (!C107655bf.A0c(r9, A03, file)) {
                Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                r0 = new AnonymousClass6z0(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            } else {
                return;
            }
            throw r0;
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new AnonymousClass6z0(0, "Could not access file or failed to move files properly");
        }
    }

    public static void A03(C153407bG r14, File file, File file2, File file3, File file4, int i, long j, long j2, long j3, long j4) {
        String absolutePath;
        Log.i("mp4ops/mux/start");
        File file5 = file2;
        File file6 = file3;
        C153407bG r7 = r14;
        C134206ic A02 = r14.A02(file5, file6);
        float f = ((float) j) / 1000.0f;
        float f2 = ((float) j4) / 1000.0f;
        float f3 = ((float) j3) / 1000.0f;
        float f4 = ((float) j2) / 1000.0f;
        String str = "";
        if (file2 == null) {
            absolutePath = str;
        } else {
            try {
                absolutePath = file5.getAbsolutePath();
            } catch (Error e) {
                Log.e("mp4ops/mux/failed: mp4mux error, exiting", e);
                throw new AnonymousClass6z0(0, e.getMessage());
            }
        }
        if (file3 != null) {
            str = file6.getAbsolutePath();
        }
        File file7 = file;
        LibMp4OperationResult mp4mux = mp4mux(absolutePath, str, file.getAbsolutePath(), f, 0.0f, f3, f4, i, file4.getAbsolutePath(), f2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mp4ops/mux/result: ");
        C18260x0.A1V(A0o, mp4mux.success);
        C153407bG.A00(mp4mux, r7, A02, file7);
        if (!mp4mux.success) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mp4ops/mux/error_message/");
            C18260x0.A1K(A0o2, mp4mux.errorMessage);
            if (mp4mux.ioException) {
                throw AnonymousClass002.A0C("No space");
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("invalid result, error_code: ");
            int i2 = mp4mux.errorCode;
            throw new AnonymousClass6z0(i2, AnonymousClass000.A0h(A0o3, i2));
        }
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("mp4ops/mux/finished, size:");
        C18260x0.A1I(A0o4, file7.length());
    }

    public static void A04(C153407bG r7, File file, boolean z) {
        LibMp4OperationResult mp4check;
        Log.i("mp4ops/check/start");
        C134206ic A04 = r7.A04(file, C18290x4.A0Z(), z);
        int i = 0;
        do {
            try {
                mp4check = mp4check(file.getAbsolutePath(), z);
                if (mp4check.success || !mp4check.ioException) {
                    C626936e.A06(mp4check);
                    C153407bG.A00(mp4check, r7, A04, (File) null);
                } else {
                    SystemClock.sleep(100);
                    i++;
                }
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                throw new AnonymousClass6z0(0, "integrity check error");
            }
        } while (i < 5);
        C626936e.A06(mp4check);
        C153407bG.A00(mp4check, r7, A04, (File) null);
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mp4ops/check/error_message/");
        C18260x0.A1K(A0o, mp4check.errorMessage);
        int i2 = mp4check.errorCode;
        throw new AnonymousClass6z0(i2, AnonymousClass000.A0Y("integrity check failed, error_code: ", AnonymousClass001.A0o(), i2));
    }

    public boolean A05(C153407bG r9, File file) {
        Log.i("mp4ops/checkAndRepair/start");
        C134206ic A04 = r9.A04(file, C18290x4.A0a(), false);
        C56512s6 r1 = this.A00;
        File A03 = r1.A03(file);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mp4ops/checkAndRepair/repairFileName.exists");
        C18260x0.A1V(A0o, A03.exists());
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath(), A03.getAbsolutePath());
            if (A04 != null) {
                C134206ic.A01(A04);
                A04.A0D = AnonymousClass0x9.A0m(mp4checkAndRepair.errorCode);
                A04.A0C = AnonymousClass6C9.A0Z(A03);
                AudioStreamInfo audioStreamInfo = mp4checkAndRepair.asi;
                if (audioStreamInfo != null) {
                    C134206ic.A00(audioStreamInfo, A04);
                    A04.A09 = AnonymousClass0x2.A0U();
                    A04.A01 = Integer.valueOf(audioStreamInfo.type);
                }
                AnonymousClass6C8.A10(mp4checkAndRepair.vsi, A04);
                r9.A02.BhD(A04);
            }
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired) {
                    A03.delete();
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("mp4ops/checkAndRepair/error_message/");
                C18260x0.A1K(A0o2, mp4checkAndRepair.errorMessage);
                if (mp4checkAndRepair.ioException) {
                    throw AnonymousClass002.A0C("No space");
                }
                int i = mp4checkAndRepair.errorCode;
                throw new AnonymousClass6z0(i, AnonymousClass000.A0Y("integrity check/repair failed, error_code: ", AnonymousClass001.A0o(), i));
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                C18260x0.A1L(A0o3, A03.getAbsolutePath());
                A02(r9, A03, file);
                return true;
            }
            Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
            File A032 = r1.A03(file);
            A02(r9, file, A032);
            if (file.length() == A032.length()) {
                return false;
            }
            if (A032.renameTo(file)) {
                return true;
            }
            Log.i("mp4ops/checkAndRepair/rename_failed");
            throw AnonymousClass002.A0C("unable to rename file");
        } catch (Error e) {
            Log.e("mp4ops/integration fail/", e);
            if (e.getCause() instanceof FileNotFoundException) {
                throw e;
            }
            throw new AnonymousClass6z0(0, "integrity check error");
        }
    }

    public Mp4Ops(C56512s6 r1) {
        this.A00 = r1;
    }
}
