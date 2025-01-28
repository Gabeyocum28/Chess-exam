package chess;

import java.util.ArrayList;
import java.util.Collection;

public class PawnMovesCalc {
    public Collection<ChessMove> pieceMovesCalc(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> PossableMoves = new ArrayList<>();
        int row = myPosition.getRow();
        int col = myPosition.getColumn();
        ChessPiece myPiece = board.getPiece(myPosition);


        if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE){
            row++;
        }
        if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK) {
            row--;
        }
        if(row > 0||col > 0||row < 9||col < 9) {
            ChessPosition newPosition = new ChessPosition(row, col);
            if(board.getPiece(newPosition) == null) {
                if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE && row == 8) {
                    ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                    PossableMoves.add(move);
                }else if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK && row == 1) {
                    ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                    PossableMoves.add(move);
                    move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                    PossableMoves.add(move);
                }else {
                    ChessMove move = new ChessMove(myPosition, newPosition, null);
                    PossableMoves.add(move);
                }

            }
            row = myPosition.getRow();
            col = myPosition.getColumn();

            if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE){
                row++;
                col++;
            }
            if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK) {
                row--;
                col++;
            }
            if(row > 0 && col > 0 && row < 9 && col < 9) {
                newPosition = new ChessPosition(row, col);
                if (board.getPiece(newPosition) != null) {
                    if (board.getPiece(newPosition).getTeamColor() != myPiece.getTeamColor()) {

                        if (myPiece.getTeamColor() == ChessGame.TeamColor.WHITE && row == 8) {
                            ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                            PossableMoves.add(move);
                        }
                        else if (myPiece.getTeamColor() == ChessGame.TeamColor.BLACK && row == 1) {
                            ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                            PossableMoves.add(move);
                        }else{
                            ChessMove move = new ChessMove(myPosition, newPosition, null);
                            PossableMoves.add(move);
                        }
                    }
                }
            }
            row = myPosition.getRow();
            col = myPosition.getColumn();

            if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE){
                row++;
                col--;
            }
            if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK) {
                row--;
                col--;
            }
            if(row > 0 && col > 0 && row < 9 && col < 9) {
                newPosition = new ChessPosition(row, col);
                if (board.getPiece(newPosition) != null) {
                    if (board.getPiece(newPosition).getTeamColor() != myPiece.getTeamColor()) {

                        if (myPiece.getTeamColor() == ChessGame.TeamColor.WHITE && row == 8) {
                            ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                            PossableMoves.add(move);
                        }
                        else if (myPiece.getTeamColor() == ChessGame.TeamColor.BLACK && row == 1) {
                            ChessMove move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.ROOK);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.BISHOP);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.KNIGHT);
                            PossableMoves.add(move);
                            move = new ChessMove(myPosition, newPosition, ChessPiece.PieceType.QUEEN);
                            PossableMoves.add(move);
                        }else  {
                            ChessMove move = new ChessMove(myPosition, newPosition, null);
                            PossableMoves.add(move);
                        }
                    }
                }
            }

            row = myPosition.getRow();
            col = myPosition.getColumn();

            if(myPiece.getTeamColor() == ChessGame.TeamColor.WHITE && row == 2){
                row++;
                newPosition = new ChessPosition(row, col);
                if(board.getPiece(newPosition) == null) {
                    row++;
                    newPosition = new ChessPosition(row, col);
                    if (board.getPiece(newPosition) == null) {
                        ChessMove move = new ChessMove(myPosition, newPosition, null);
                        PossableMoves.add(move);
                    }
                }
            }
            if(myPiece.getTeamColor() == ChessGame.TeamColor.BLACK && row == 7) {
                row--;
                newPosition = new ChessPosition(row, col);
                if(board.getPiece(newPosition) == null) {
                    row--;
                    newPosition = new ChessPosition(row, col);
                    if (board.getPiece(newPosition) == null) {
                        ChessMove move = new ChessMove(myPosition, newPosition, null);
                        PossableMoves.add(move);
                    }
                }
            }

        }

        return PossableMoves;
    }
    //test
}
