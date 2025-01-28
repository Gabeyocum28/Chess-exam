package chess;

import java.util.ArrayList;
import java.util.Collection;

public class BishopMovesCalc {
    public Collection<ChessMove> pieceMovesCalc(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> PossableMoves = new ArrayList<>();
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessPiece myPiece = board.getPiece(myPosition);
        int start = 0;
        int i = 0;

        while(true){
            if(start == 0){
                row = myPosition.getRow();
                col = myPosition.getColumn();
                start++;
            }

            if(i == 0){
                row++;
                col++;
            }else if(i == 1){
                row++;
                col--;
            }else if(i == 2){
                row--;
                col++;
            }else if(i == 3){
                row--;
                col--;
            }else{
                break;
            }

            if(row < 1 || row > 8 || col < 1 || col > 8){
                i++;
                start--;
                continue;
            }
            ChessPosition newPosition = new ChessPosition(row, col);
            if(board.getPiece(newPosition) != null){
                if(board.getPiece(newPosition).getTeamColor() != myPiece.getTeamColor()){
                    ChessMove move = new ChessMove(myPosition, newPosition, null);
                    PossableMoves.add(move);
                    i++;
                    start--;
                    continue;
                }else{
                    i++;
                    start--;
                    continue;
                }
            }
            ChessMove move = new ChessMove(myPosition, newPosition, null);
            PossableMoves.add(move);
        }
        return PossableMoves;
    }
}
